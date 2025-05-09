package com.example.mongodbapi.service;

import com.example.mongodbapi.model.FoodPairing;
import com.example.mongodbapi.repository.FoodPairingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

@Service
public class FoodPairingService {

    @Autowired
    private FoodPairingRepository foodPairingRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    // Hardcoded set of all valid numeric IDs from your JSON
    private static final Set<String> VALID_IDS = Set.of(
        "2", "3", "4", "1", "5", "8", "6", "7", "9", "11", "13", "14", "12", "10", "17", "15", "21", "16", "22", 
        "26", "24", "25", "18", "19", "20", "23", "28", "29", "27", "31", "30", "32", "42", "34", "39", "40", 
        "33", "36", "37", "41", "43", "44", "35", "38", "49", "45", "50", "48", "51", "46", "55", "47", "52", 
        "54", "53", "56", "57", "60", "61", "64", "68", "62", "66", "69", "74", "77", "78", "81", "85", "87", 
        "75", "76", "89", "90", "82", "86", "91", "92", "58", "59", "63", "71", "72", "65", "67", "70", "73", 
        "84", "93", "79", "80", "83", "88", "94", "97", "100", "101", "110", "112", "103", "107", "111", "116", 
        "120", "122", "118", "121", "129", "127", "137", "138", "131", "132", "133", "143", "144", "148", "136", 
        "140", "149", "158", "141", "153", "95", "98", "105", "109", "115", "96", "99", "102", "117", "123", 
        "124", "104", "106", "108", "113", "114", "119", "125", "130", "134", "142", "145", "146", "126", "128", 
        "147", "151", "155", "135", "139", "150", "152", "156", "154", "157", "163", "164", "165", "179", "166", 
        "167", "172", "173", "168", "169", "170", "178", "176", "180", "181", "182", "183", "184", "185", "159", 
        "160", "161", "162", "171", "174", "175", "177", "186", "188", "187", "189", "190", "191", "194", "192", 
        "193", "196", "195", "197", "198", "200", "199", "201", "203", "202", "204", "206", "207", "205", "209", 
        "212", "208", "210", "211", "213", "218", "214", "215", "216", "217", "219", "222", "223", "224", "220", 
        "221", "225", "226", "227", "228", "229", "232", "230", "234", "231", "233", "236", "238", "237", "235", 
        "240", "239", "241", "244", "242", "243", "245", "246", "247", "248", "255", "249", "258", "278", "252", 
        "262", "283", "285", "264", "266", "286", "289", "290", "279", "287", "288", "291", "292", "251", "257", 
        "260", "263", "268", "250", "253", "272", "274", "277", "254", "256", "281", "284", "259", "261", "293", 
        "265", "267", "269", "270", "271", "273", "275", "276", "280", "282", "295", "303", "304", "321", "324", 
        "333", "335", "343", "305", "306", "310", "311", "317", "323", "325", "326", "328", "329", "330", "340", 
        "341", "342", "296", "297", "300", "307", "315", "318", "319", "320", "332", "336", "337", "339", "294", 
        "298", "299", "301", "302", "308", "309", "312", "313", "314", "316", "322", "327", "331", "334", "338", 
        "344", "345", "346", "350", "349", "347", "348", "352", "351", "353", "355", "354", "356", "357", "358", 
        "359", "360", "361", "362", "365", "363", "364", "367", "368", "366", "370", "369", "371", "373", "372", 
        "374", "376", "375", "377", "378", "381", "379", "380", "382", "383", "387", "385", "388", "396", "386", 
        "389", "391", "392", "400", "397", "398", "401", "405", "404", "384", "393", "394", "395", "402", "403", 
        "390", "399", "408", "412", "411", "416", "418", "415", "422", "426", "409", "410", "414", "421", "423", 
        "413", "417", "424", "425", "419", "427", "434", "428", "431", "432", "439", "440", "436", "443", "446", 
        "448", "449", "450", "429", "451", "430", "433", "435", "441", "442", "447", "437", "438", "444", "445", 
        "454", "453", "459", "463", "455", "456", "457", "460", "462", "465", "466", "452", "458", "461", "464", 
        "467", "468", "469", "474", "475", "472", "470", "471", "473", "477", "476", "478", "485", "480", "486", 
        "481", "482", "484", "487", "488", "489", "492", "490", "491", "494", "493", "495", "496", "497", "498", 
        "499", "500", "501", "504", "503", "505", "502", "506", "508", "507", "509", "511", "510", "512", "514", 
        "513", "515", "517", "516", "518", "519", "520", "523", "521", "522", "526", "524", "525", "528", "529", 
        "527", "530", "532", "531", "533", "535", "534", "537", "541", "536", "538", "543", "544", "539", "540", 
        "542", "545", "548", "549", "550", "552", "547", "551", "553", "546", "555", "562", "564", "567", "554", 
        "557", "559", "561", "568", "556", "558", "560", "563", "565", "566", "570", "571", "572", "573", "569", 
        "574", "575", "576", "577", "579", "580", "584", "585", "583", "586", "592", "578", "581", "587", "589", 
        "590", "582", "588", "591", "595", "594", "603", "604", "597", "598", "607", "609", "593", "596", "600", 
        "610", "612", "606", "601", "602", "608", "611", "613", "622", "615", "617", "626", "628", "630", "635", 
        "618", "620", "637", "640", "627", "633", "645", "646", "636", "638", "650", "654", "641", "644", "648", 
        "653", "619", "624", "625", "629", "631", "614", "616", "634", "639", "621", "623", "642", "643", "649", 
        "651", "632", "647", "652", "658", "655", "660", "656", "657", "659", "661", "662", "663", "664", "668", 
        "671", "672", "675", "665", "669", "676", "667", "670", "673", "674", "683", "677", "684", "685", "680", 
        "682", "678", "679", "686", "690", "693", "697", "698", "694", "695", "688", "696", "687", "691", "699", 
        "700", "702", "703", "707", "708", "705", "706", "709", "701", "704", "713", "711", "723", "730", "712", 
        "714", "736", "715", "722", "724", "727", "728", "729", "719", "720", "733", "731", "732", "737", "735", 
        "738", "739", "710", "716", "717", "718", "721", "725", "726", "734", "740", "744", "742", "748", "764", 
        "765", "746", "749", "750", "747", "751", "755", "766", "768", "772", "769", "774", "741", "743", "745", 
        "753", "756", "757", "758", "770", "771", "773", "752", "754", "759", "762", "763", "767", "775", "776", 
        "781", "784", "780", "782", "786", "788", "789", "791", "792", "793", "778", "785", "787", "777", "783", 
        "790", "794", "795", "800", "803", "796", "799", "805", "806", "807", "810", "814", "815", "817", "820", 
        "818", "822", "823", "821", "825", "826", "824", "829", "831", "830", "827", "828", "832", "833", "834", 
        "836", "835", "837", "840", "841", "839", "845", "842", "843", "846", "847", "848", "851", "850", "849", 
        "852", "854", "853", "857", "860", "862", "861", "865", "863", "864", "867", "870", "868", "869", "855", 
        "856", "858", "859", "875", "872", "878", "880", "876", "883", "886", "890", "889", "894", "893", "900", 
        "898", "899", "904", "905", "913", "921", "902", "906", "907", "915", "924", "929", "916", "918", "926", 
        "928", "932", "941", "945", "949", "931", "936", "952", "943", "944", "947", "950", "871", "873", "879", 
        "884", "895", "897", "901", "874", "881", "909", "914", "920", "925", "930", "935", "951", "882", "885", 
        "887", "891", "896", "908", "911", "912", "917", "919", "923", "927", "933", "934", "937", "938", "939", 
        "942", "948", "953", "959", "954", "963", "968", "955", "967", "969", "971", "978", "972", "977", "961", 
        "962", "964", "956", "958", "960", "965", "970"
    );

    public List<FoodPairing.SimilarEntity> getTop10SimilarEntities(String entityId) {
        System.out.println("Food Pairing Service called with entityId: " + entityId);

        // 1. Instant O(1) lookup against hardcoded IDs
        if (!VALID_IDS.contains(entityId)) {
            System.out.println("Food ID " + entityId + " not found in valid IDs");
            return Collections.emptyList();
        }

        // 2. Single database query
        Optional<FoodPairing> foodPairingOpt = foodPairingRepository.findById(entityId);
        if (!foodPairingOpt.isPresent()) {
            System.out.println("No food pairing found in database for ID: " + entityId);
            return Collections.emptyList();
        }

        // 3. Process the found food pairing
        FoodPairing foodPairing = foodPairingOpt.get();
        System.out.println("Processing food pairing with ID: " + foodPairing.getId());
        
        String similarEntitiesJson = foodPairing.getSimilarEntities();
        System.out.println("Similar entities JSON length: " + 
            (similarEntitiesJson != null ? similarEntitiesJson.length() : "null"));

        List<FoodPairing.SimilarEntity> topSimilarEntities = parseSimilarEntities(similarEntitiesJson);
        System.out.println("Parsed " + topSimilarEntities.size() + " similar entities");

        // 4. Sort and return top 10
        topSimilarEntities.sort(Comparator.comparingInt(
            FoodPairing.SimilarEntity::getSimilarMolecules).reversed());
        
        return topSimilarEntities.size() > 10 ? 
            topSimilarEntities.subList(0, 10) : topSimilarEntities;
    }

    private List<FoodPairing.SimilarEntity> parseSimilarEntities(String similarEntitiesJson) {
        if (similarEntitiesJson == null || similarEntitiesJson.trim().isEmpty()) {
            System.out.println("Similar entities JSON is null or empty");
            return Collections.emptyList();
        }
        
        // First try manual extraction
        List<FoodPairing.SimilarEntity> manualResult = extractEntitiesManually(similarEntitiesJson);
        if (!manualResult.isEmpty()) {
            System.out.println("Manual extraction found " + manualResult.size() + " entities");
            return manualResult;
        }
        
        try {
            // Apply JSON fixes
            String fixedJson = similarEntitiesJson.replace("'", "\"")
                .replaceAll("\\bnan\\b", "null")
                .replaceAll("\\}\\s*\\{", "},{")
                .replaceAll("\"s\\s+", "\", \"s")
                .replaceAll("\"\\s*,\\s*\"", "\":\"");
            
            // Clean up escape sequences
            fixedJson = cleanupEscapeSequences(fixedJson);
            
            // Ensure valid JSON array format
            if (!fixedJson.trim().startsWith("[")) fixedJson = "[" + fixedJson;
            if (!fixedJson.trim().endsWith("]")) fixedJson = fixedJson + "]";
            
            // Parse with ObjectMapper
            return objectMapper.readValue(fixedJson, 
                new TypeReference<List<FoodPairing.SimilarEntity>>() {});
            
        } catch (Exception e) {
            System.out.println("JSON parsing error: " + e.getMessage());
            return manualResult.isEmpty() ? Collections.emptyList() : manualResult;
        }
    }

    private String cleanupEscapeSequences(String json) {
        return json.replaceAll("\\\\x[0-9a-fA-F]{2}", "")
                   .replaceAll("\\\\u[0-9a-fA-F]{4}", "")
                   .replaceAll("[\\\\](?![\"bfnrt/\\\\])", "");
    }

    private List<FoodPairing.SimilarEntity> extractEntitiesManually(String json) {
        List<FoodPairing.SimilarEntity> result = new ArrayList<>();
        if (json == null || json.trim().isEmpty()) return result;
        
        try {
            String fixedJson = json.replace("'", "\"")
                             .replaceAll("\\bnan\\b", "null")
                             .replaceAll("\\\\x[0-9a-fA-F]{2}", "")
                             .replaceAll("\\\\u[0-9a-fA-F]{4}", "")
                             .replaceAll("[\\\\](?![\"bfnrt/\\\\])", "");
            
            // Regex pattern to match entity objects
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
                "\\{\"entity_name\":\\s*\"([^\"]*)\",\\s*\"category\":\\s*\"([^\"]*)\"," +
                "\\s*\"similar_molecules\":\\s*(\\d+|null),\\s*\"wikipedia\":\\s*\"([^\"]*)\"\\}"
            );
            
            java.util.regex.Matcher matcher = pattern.matcher(fixedJson);
            while (matcher.find()) {
                FoodPairing.SimilarEntity entity = new FoodPairing.SimilarEntity();
                entity.setEntityName(matcher.group(1));
                entity.setCategory(matcher.group(2));
                
                String molecules = matcher.group(3);
                entity.setSimilarMolecules("null".equals(molecules) ? 0 : Integer.parseInt(molecules));
                
                entity.setWikipedia(matcher.group(4));
                result.add(entity);
                
                if (result.size() >= 1000) break; // Safety limit
            }
        } catch (Exception e) {
            System.out.println("Manual extraction error: " + e.getMessage());
        }
        
        return result;
    }
}

