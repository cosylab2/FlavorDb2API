## Endpoints
 

### 1. Molecule Data

**Endpoint**: `/api/molecules_data/by-commonName`

**HTTP Method**: GET

**Inputs**: Query parameter: `commonName` (String)

**Example**: `/api/molecules_data/by-commonName?commonName=propan-2-one`
**Response-Time**: 697 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fd8",
        "pubchemId": 4,
        "iupacName": "1-aminopropan-2-ol",
        "commonName": "1-Aminopropan-2-ol",
        "smile": "CC(CN)O",
        "molecularWeight": 75.111,
        "hbdCount": 2,
        "hbaCount": 2,
        "numRotatableBonds": 1,
        "complexity": 22.9,
        "topologicalPolarSurfaceArea": 46.2,
        "monoisotopicMass": 75.068,
        "exactMass": 75.068,
        "xlogp": -1.0,
        "charge": 0,
        "heavyAtomCount": 5,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "2799-17-9@78-96-6@2799-16-8",
        "femaNumber": "3965",
        "femaFlavorProfile": "NaN",
        "odor": "slight ammonia odor",
        "taste": "NaN",
        "functionalGroups": "hydroxy compound@alcohol@secondary alcohol@1,2-aminoalcohol@amine@primary amine@primary aliphatic amine (alkylamine)",
        "inchi": "InChI=1S/C3H9NO/c1-3(5)2-4/h3,5H,2,4H2,1H3",
        "volume3d": 63.3,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB008936",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    }
]

```
**Error**:  
**URL**: `localhost:8080/api/molecules_data/by-commonName?common_name=1-aminopropan-2-ol`  
**Output**: `[]`

**URL**: `localhost:8080/api/molecules_data/by-commonName?common_name= 0`  
**Output**: `[]`

**URL**: `localhost:8080/api/molecules_data/by-commonName?common_name= 1.5-Aminopropan-2-ol`  
**Output**: `[]`

-------
**Endpoint**: `/api/molecules_data/by-functionalGroups`

**HTTP Method**: GET

**Inputs**: Query parameter: `functional_groups` 

**Example**: `/api/molecules_data/by-functionalGroups?functional_groups=hemiacetal@hydroxy compound@alcohol@primary alcohol@secondary alcohol@1,2-diol@heterocyclic compound`
**Response-Time**: 66 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fd9",
        "pubchemId": 40,
        "iupacName": "6-(hydroxymethyl)oxane-2,4,5-triol",
        "commonName": "2-Deoxyhexopyranose",
        "smile": "C1C(C(C(OC1O)CO)O)O",
        "molecularWeight": 164.157,
        "hbdCount": 4,
        "hbaCount": 5,
        "numRotatableBonds": 1,
        "complexity": 128.0,
        "topologicalPolarSurfaceArea": 90.2,
        "monoisotopicMass": 164.068,
        "exactMass": 164.068,
        "xlogp": -1.6,
        "charge": 0,
        "heavyAtomCount": 11,
        "atomStereoCount": 4,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 4,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "14215-77-1",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "hemiacetal@hydroxy compound@alcohol@primary alcohol@secondary alcohol@1,2-diol@heterocyclic compound",
        "inchi": "InChI=1S/C6H12O5/c7-2-4-6(10)3(8)1-5(9)11-4/h3-10H,1-2H2",
        "volume3d": 116.0,
        "foodDbFlavorProfile": "NaN",
        "superSweet": "Sweet",
        "bitter": 0.0,
        "superSweetDbId": 9189.0,
        "bitterDbId": "NaN",
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "sweet"
    },..etc.

```
**Error**:  
**URL**: `localhost:8080/api/molecules_data/by-functionalGroups?functional_groups=Hemiacetal@hydroxy compound@alcohol@primary alcohol@secondary alcohol@1,2-diol@heterocyclic compound`  
**Output**: `[]`

**URL**: `localhost:8080/api/molecules_data/by-functionalGroups?functional_groups=0`  
**Output**: `[]`


-------
**Endpoint**: `/api/molecules_data/by-flavorProfile`

**HTTP Method**: GET

**Inputs**: Query parameter: `by-flavorProfile` 

**Example**: `/api/molecules_data/by-flavorProfile?flavor_profile=fishy`
**Response-Time**: 66 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fd8",
        "pubchemId": 4,
        "iupacName": "1-aminopropan-2-ol",
        "commonName": "1-Aminopropan-2-ol",
        "smile": "CC(CN)O",
        "molecularWeight": 75.111,
        "hbdCount": 2,
        "hbaCount": 2,
        "numRotatableBonds": 1,
        "complexity": 22.9,
        "topologicalPolarSurfaceArea": 46.2,
        "monoisotopicMass": 75.068,
        "exactMass": 75.068,
        "xlogp": -1.0,
        "charge": 0,
        "heavyAtomCount": 5,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "2799-17-9@78-96-6@2799-16-8",
        "femaNumber": "3965",
        "femaFlavorProfile": "NaN",
        "odor": "slight ammonia odor",
        "taste": "NaN",
        "functionalGroups": "hydroxy compound@alcohol@secondary alcohol@1,2-aminoalcohol@amine@primary amine@primary aliphatic amine (alkylamine)",
        "inchi": "InChI=1S/C3H9NO/c1-3(5)2-4/h3,5H,2,4H2,1H3",
        "volume3d": 63.3,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB008936",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    },
    {
        "id": "6784f1c1e07c0c5b545e81a0",
        "pubchemId": 7283,
        "iupacName": "2-methylbutan-1-amine",
        "commonName": "2-Methylbutylamine",
        "smile": "CCC(C)CN",
        "molecularWeight": 87.166,
        "hbdCount": 1,
        "hbaCount": 1,
        "numRotatableBonds": 2,
        "complexity": 27.1,
        "topologicalPolarSurfaceArea": 26.0,
        "monoisotopicMass": 87.105,
        "exactMass": 87.105,
        "xlogp": 1.0,
        "charge": 0,
        "heavyAtomCount": 6,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "96-15-1",
        "femaNumber": "4241",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "amine@primary amine@primary aliphatic amine (alkylamine)",
        "inchi": "InChI=1S/C5H13N/c1-3-5(2)4-6/h5H,3-4,6H2,1-2H3",
        "volume3d": 79.6,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB009820",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    },
    {
        "id": "6784f1c1e07c0c5b545e88e0",
        "pubchemId": 118823,
        "iupacName": "3-methyl-N-(3-methylbutyl)butan-1-imine",
        "commonName": "1-Butanamine, 3-methyl-N-(3-methylbutylidene)-",
        "smile": "CC(C)CCN=CCC(C)C",
        "molecularWeight": 155.285,
        "hbdCount": 0,
        "hbaCount": 1,
        "numRotatableBonds": 5,
        "complexity": 103.0,
        "topologicalPolarSurfaceArea": 12.4,
        "monoisotopicMass": 155.167,
        "exactMass": 155.167,
        "xlogp": 2.8,
        "charge": 0,
        "heavyAtomCount": 11,
        "atomStereoCount": 0,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "35448-31-8",
        "femaNumber": "3990",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "imine",
        "inchi": "InChI=1S/C10H21N/c1-9(2)5-7-11-8-6-10(3)4/h7,9-10H,5-6,8H2,1-4H3",
        "volume3d": 142.8,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB009647",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    }
]
```
**Error**:  
**URL**: `localhost:8080/api/molecules_data/by-flavorProfile?flavor_profile=Fishy (Case Sensitive)`  
**Output**: `[]`

**URL**: `localhost:8080/api/molecules_data/by-flavorProfile?flavor_profile=0`  
**Output**: `[]`

-------
**Endpoint**: `/api/molecules_data/by-femaFlavorProfile`

**HTTP Method**: GET

**Inputs**: Query parameter: `by-femaFlavorProfile` 

**Example**: `/api/molecules_data/by-femaFlavorProfile?fema_flavor_profile=Fruit`
**Response-Time**: 455 ms
 
**Output**:

```json
[
    [
    {
        "id": "6784f1c1e07c0c5b545e7fda",
        "pubchemId": 47,
        "iupacName": "3-methyl-2-oxopentanoic acid",
        "commonName": "3-Methyl-2-oxovaleric acid",
        "smile": "CCC(C)C(=O)C(=O)O",
        "molecularWeight": 130.143,
        "hbdCount": 1,
        "hbaCount": 3,
        "numRotatableBonds": 3,
        "complexity": 128.0,
        "topologicalPolarSurfaceArea": 54.4,
        "monoisotopicMass": 130.063,
        "exactMass": 130.063,
        "xlogp": 1.1,
        "charge": 0,
        "heavyAtomCount": 9,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "1460-34-0@39748-49-7",
        "femaNumber": "3870",
        "femaFlavorProfile": "Fruit",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "carbonyl compound@ketone@carboxylic acid derivative@carboxylic acid",
        "inchi": "InChI=1S/C6H10O3/c1-3-4(2)5(7)6(8)9/h4H,3H2,1-2H3,(H,8,9)",
        "volume3d": 103.4,
        "foodDbFlavorProfile": "NaN",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "NaN"
    },...etc
```
**Error**:  
**URL**: `localhost:8080/api/molecules_data/by-femaFlavorProfile?fema_flavor_profile=fruit (Case Sensitive)`  
**Output**: `[]`

**URL**: `localhost:8080/api/molecules_data/by-femaFlavorProfile?fema_flavor_profile=0`  
**Output**: `[]`

-------
**Endpoint**: `/api/molecules_data/by-pubchemId`

**HTTP Method**: GET

**Inputs**: Query parameter: `by-pubchemId` 

**Example**: `/api/molecules_data/by-pubchemId?pubchem_id=4`
**Response-Time**: 72 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fd8",
        "pubchemId": 4,
        "iupacName": "1-aminopropan-2-ol",
        "commonName": "1-Aminopropan-2-ol",
        "smile": "CC(CN)O",
        "molecularWeight": 75.111,
        "hbdCount": 2,
        "hbaCount": 2,
        "numRotatableBonds": 1,
        "complexity": 22.9,
        "topologicalPolarSurfaceArea": 46.2,
        "monoisotopicMass": 75.068,
        "exactMass": 75.068,
        "xlogp": -1.0,
        "charge": 0,
        "heavyAtomCount": 5,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "2799-17-9@78-96-6@2799-16-8",
        "femaNumber": "3965",
        "femaFlavorProfile": "NaN",
        "odor": "slight ammonia odor",
        "taste": "NaN",
        "functionalGroups": "hydroxy compound@alcohol@secondary alcohol@1,2-aminoalcohol@amine@primary amine@primary aliphatic amine (alkylamine)",
        "inchi": "InChI=1S/C3H9NO/c1-3(5)2-4/h3,5H,2,4H2,1H3",
        "volume3d": 63.3,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB008936",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    }
]
```
**Error**:  
**URL**: `localhost:8080/api/molecules_data/by-pubchemId?pubchem_id=abc`  
**Output**: `[]`

**URL**: `localhost:8080/api/molecules_data/by-pubchemId?pubchem_id=0`  
**Output**: `[]`

**Fixed Error**:
**URL**: `localhost:8080/api/molecules_data/by-pubchemId?pubchem_id=abc` 
**Output**: 
```json 
	{
	    "statusCode": 500,
	    "message": "An unexpected error occurred.",
	    "details": "uri=/api/molecules_data/by-pubchemId"
	}
```
------
**Endpoint**: `/api/molecules_data/by-monoisotopicMass`

**HTTP Method**: GET

**Inputs**: Query parameter: `monoisotopic_mass` 

**Example**: `/api/molecules_data/by-monoisotopicMass?monoisotopic_mass=75.068`
**Response-Time**: 61 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fd8",
        "pubchemId": 4,
        "iupacName": "1-aminopropan-2-ol",
        "commonName": "1-Aminopropan-2-ol",
        "smile": "CC(CN)O",
        "molecularWeight": 75.111,
        "hbdCount": 2,
        "hbaCount": 2,
        "numRotatableBonds": 1,
        "complexity": 22.9,
        "topologicalPolarSurfaceArea": 46.2,
        "monoisotopicMass": 75.068,
        "exactMass": 75.068,
        "xlogp": -1.0,
        "charge": 0,
        "heavyAtomCount": 5,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "2799-17-9@78-96-6@2799-16-8",
        "femaNumber": "3965",
        "femaFlavorProfile": "NaN",
        "odor": "slight ammonia odor",
        "taste": "NaN",
        "functionalGroups": "hydroxy compound@alcohol@secondary alcohol@1,2-aminoalcohol@amine@primary amine@primary aliphatic amine (alkylamine)",
        "inchi": "InChI=1S/C3H9NO/c1-3(5)2-4/h3,5H,2,4H2,1H3",
        "volume3d": 63.3,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB008936",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    },
    {
        "id": "6784f1c1e07c0c5b545e8060",
        "pubchemId": 1145,
        "iupacName": "N,N-dimethylmethanamine oxide",
        "commonName": "Trimethylamine N-Oxide",
        "smile": "C[N+](C)(C)[O-]",
        "molecularWeight": 75.111,
        "hbdCount": 0,
        "hbaCount": 1,
        "numRotatableBonds": 0,
        "complexity": 28.4,
        "topologicalPolarSurfaceArea": 18.1,
        "monoisotopicMass": 75.068,
        "exactMass": 75.068,
        "xlogp": -0.3,
        "charge": 0,
        "heavyAtomCount": 5,
        "atomStereoCount": 0,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "1184-78-7",
        "femaNumber": "4245",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "N-oxide",
        "inchi": "InChI=1S/C3H9NO/c1-4(2,3)5/h1-3H3",
        "volume3d": 65.5,
        "foodDbFlavorProfile": "odorless",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB010413",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "odorless"
    }
]
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/by-monoisotopicMass?monoisotopic_mass=0`  
**Output**: `[]`

------
**Endpoint**: `/api/molecules_data/by-topologicalPolarSurfaceArea`

**HTTP Method**: GET

**Inputs**: Query parameter: `topological_polar_surface_area` 

**Example**: `/api/molecules_data/by-topologicalPolarSurfaceArea?topological_polar_surface_area=91.7`
**Response-Time**: 58 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fdc",
        "pubchemId": 51,
        "iupacName": "2-oxopentanedioic acid",
        "commonName": "2-ketoglutaric acid",
        "smile": "C(CC(=O)O)C(=O)C(=O)O",
        "molecularWeight": 146.098,
        "hbdCount": 2,
        "hbaCount": 5,
        "numRotatableBonds": 4,
        "complexity": 171.0,
        "topologicalPolarSurfaceArea": 91.7,
        "monoisotopicMass": 146.022,
        "exactMass": 146.022,
        "xlogp": -0.9,
        "charge": 0,
        "heavyAtomCount": 10,
        "atomStereoCount": 0,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "22202-68-2@328-50-7@17091-15-5@34410-46-3@997-43-3",
        "femaNumber": "3891",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "carbonyl compound@ketone@carboxylic acid derivative@carboxylic acid",
        "inchi": "InChI=1S/C5H6O5/c6-3(5(9)10)1-2-4(7)8/h1-2H2,(H,7,8)(H,9,10)",
        "volume3d": 105.7,
        "foodDbFlavorProfile": "odorless",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB003361",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "odorless"
    },
    {
        "id": "6784f1c1e07c0c5b545e8102",
        "pubchemId": 5865,
        "iupacName": "(8S,9S,10R,13S,14S,17R)-17-hydroxy-17-(2-hydroxyacetyl)-10,13-dimethyl-6,7,8,9,12,14,15,16-octahydrocyclopenta[a]phenanthrene-3,11-dione",
        "commonName": "prednisone",
        "smile": "CC12CC(=O)C3C(C1CCC2(C(=O)CO)O)CCC4=CC(=O)C=CC34C",
        "molecularWeight": 358.434,
        "hbdCount": 2,
        "hbaCount": 5,
        "numRotatableBonds": 2,
        "complexity": 764.0,
        "topologicalPolarSurfaceArea": 91.7,
        "monoisotopicMass": 358.178,
        "exactMass": 358.178,
        "xlogp": 1.5,
        "charge": 0,
        "heavyAtomCount": 26,
        "atomStereoCount": 6,
        "definedAtomStereoCenterCount": 6,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "53-03-2",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "odorless",
        "taste": "persistent bitter after-taste",
        "functionalGroups": "carbonyl compound@ketone@hydroxy compound@alcohol@primary alcohol@tertiary alcohol@alkene",
        "inchi": "InChI=1S/C21H26O5/c1-19-7-5-13(23)9-12(19)3-4-14-15-6-8-21(26,17(25)11-22)20(15,2)10-16(24)18(14)19/h5,7,9,14-15,18,22,26H,3-4,6,8,10-11H2,1-2H3/t14-,15-,18+,19-,20-,21-/m0/s1",
        "volume3d": 272.4,
        "foodDbFlavorProfile": "NaN",
        "superSweet": "NaN",
        "bitter": 1.0,
        "superSweetDbId": "NaN",
        "bitterDbId": 682.0,
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "bitter"
    },
    {
        "id": "6784f1c1e07c0c5b545e899a",
        "pubchemId": 160467,
        "iupacName": "5,6-dihydroxy-4-(3-methylbutanoyl)-2,6-bis(3-methylbut-2-enyl)cyclohex-4-ene-1,3-dione",
        "commonName": "5,6-dihydroxy-4-(3-methylbutanoyl)-2,6-bis(3-methylbut-2-en-1-yl)cyclohex-4-ene-1,3-dione",
        "smile": "CC(C)CC(=O)C1=C(C(C(=O)C(C1=O)CC=C(C)C)(CC=C(C)C)O)O",
        "molecularWeight": 362.466,
        "hbdCount": 2,
        "hbaCount": 5,
        "numRotatableBonds": 7,
        "complexity": 685.0,
        "topologicalPolarSurfaceArea": 91.7,
        "monoisotopicMass": 362.209,
        "exactMass": 362.209,
        "xlogp": 4.5,
        "charge": 0,
        "heavyAtomCount": 26,
        "atomStereoCount": 2,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 2,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "23510-81-8",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "carbonyl compound@ketone@enol@hydroxy compound@alcohol@tertiary alcohol@alkene",
        "inchi": "InChI=1S/C21H30O5/c1-12(2)7-8-15-18(23)17(16(22)11-14(5)6)20(25)21(26,19(15)24)10-9-13(3)4/h7,9,14-15,25-26H,8,10-11H2,1-6H3",
        "volume3d": 293.1,
        "foodDbFlavorProfile": "NaN",
        "superSweet": "NaN",
        "bitter": 1.0,
        "superSweetDbId": "NaN",
        "bitterDbId": 11.0,
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "bitter"
    },
    {
        "id": "6784f1c1e07c0c5b545e8a0c",
        "pubchemId": 185635,
        "iupacName": "5,6-dihydroxy-4-(2-methylbutanoyl)-2,6-bis(3-methylbut-2-enyl)cyclohex-4-ene-1,3-dione",
        "commonName": "28374-89-2",
        "smile": "CCC(C)C(=O)C1=C(C(C(=O)C(C1=O)CC=C(C)C)(CC=C(C)C)O)O",
        "molecularWeight": 362.466,
        "hbdCount": 2,
        "hbaCount": 5,
        "numRotatableBonds": 7,
        "complexity": 687.0,
        "topologicalPolarSurfaceArea": 91.7,
        "monoisotopicMass": 362.209,
        "exactMass": 362.209,
        "xlogp": 4.6,
        "charge": 0,
        "heavyAtomCount": 26,
        "atomStereoCount": 3,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 3,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "28374-89-2",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "carbonyl compound@ketone@enol@hydroxy compound@alcohol@tertiary alcohol@alkene",
        "inchi": "InChI=1S/C21H30O5/c1-7-14(6)17(22)16-18(23)15(9-8-12(2)3)19(24)21(26,20(16)25)11-10-13(4)5/h8,10,14-15,25-26H,7,9,11H2,1-6H3",
        "volume3d": 293.6,
        "foodDbFlavorProfile": "bitter",
        "superSweet": "NaN",
        "bitter": 1.0,
        "superSweetDbId": "NaN",
        "bitterDbId": 72.0,
        "foodDbId": "FDB001943",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "bitter"
    },
    {
        "id": "6784f1c1e07c0c5b545e9bf3",
        "pubchemId": 11175902,
        "iupacName": "(4S,5S)-3,4-dihydroxy-2-(3-methylbutanoyl)-5-(3-methylbut-2-enyl)-4-(4-methylpent-3-enoyl)cyclopent-2-en-1-one",
        "commonName": "trans-Isohumulone",
        "smile": "CC(C)CC(=O)C1=C(C(C(C1=O)CC=C(C)C)(C(=O)CC=C(C)C)O)O",
        "molecularWeight": 362.466,
        "hbdCount": 2,
        "hbaCount": 5,
        "numRotatableBonds": 8,
        "complexity": 685.0,
        "topologicalPolarSurfaceArea": 91.7,
        "monoisotopicMass": 362.209,
        "exactMass": 362.209,
        "xlogp": 3.8,
        "charge": 0,
        "heavyAtomCount": 26,
        "atomStereoCount": 2,
        "definedAtomStereoCenterCount": 2,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "467-72-1",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "carbonyl compound@ketone@enol@hydroxy compound@alcohol@tertiary alcohol@alkene",
        "inchi": "InChI=1S/C21H30O5/c1-12(2)7-9-15-19(24)18(16(22)11-14(5)6)20(25)21(15,26)17(23)10-8-13(3)4/h7-8,14-15,25-26H,9-11H2,1-6H3/t15-,21-/m1/s1",
        "volume3d": 293.9,
        "foodDbFlavorProfile": "NaN",
        "superSweet": "NaN",
        "bitter": 1.0,
        "superSweetDbId": "NaN",
        "bitterDbId": 79.0,
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "bitter"
    },
    {
        "id": "6784f1c1e07c0c5b545eba24",
        "pubchemId": 44201359,
        "iupacName": "(4S,5S)-3,4-dihydroxy-5-(3-methylbut-2-enyl)-4-(4-methylpent-3-enoyl)-2-(2-methylpropanoyl)cyclopent-2-en-1-one",
        "commonName": "trans-Isocohumulone",
        "smile": "CC(C)C(=O)C1=C(C(C(C1=O)CC=C(C)C)(C(=O)CC=C(C)C)O)O",
        "molecularWeight": 348.439,
        "hbdCount": 2,
        "hbaCount": 5,
        "numRotatableBonds": 7,
        "complexity": 670.0,
        "topologicalPolarSurfaceArea": 91.7,
        "monoisotopicMass": 348.194,
        "exactMass": 348.194,
        "xlogp": 3.6,
        "charge": 0,
        "heavyAtomCount": 25,
        "atomStereoCount": 2,
        "definedAtomStereoCenterCount": 2,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "NaN",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "carbonyl compound@ketone@enol@hydroxy compound@alcohol@tertiary alcohol@alkene",
        "inchi": "InChI=1S/C20H28O5/c1-11(2)7-9-14-18(23)16(17(22)13(5)6)19(24)20(14,25)15(21)10-8-12(3)4/h7-8,13-14,24-25H,9-10H2,1-6H3/t14-,20-/m1/s1",
        "volume3d": 280.3,
        "foodDbFlavorProfile": "NaN",
        "superSweet": "NaN",
        "bitter": 1.0,
        "superSweetDbId": "NaN",
        "bitterDbId": 80.0,
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "bitter"
    }
]
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/by-topologicalPolarSurfaceArea?topological_polar_surface_area=1.8`  
**Output**: `[]`
	
------
**Endpoint**: `/api/molecules_data/by-heavyAtomCount`

**HTTP Method**: GET

**Inputs**: Query parameter: `heavy_atom_count` 

**Example**: `/api/molecules_data/by-heavyAtomCount?heavy_atom_count=10`
**Response-Time**: 185 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fdc",
        "pubchemId": 0,
        "iupacName": "2-oxopentanedioic acid",
        "commonName": "2-ketoglutaric acid",
        "smile": null,
        "molecularWeight": 146.098,
        "hbdCount": 0,
        "hbaCount": 0,
        "numRotatableBonds": 0,
        "complexity": 0.0,
        "topologicalPolarSurfaceArea": 0.0,
        "monoisotopicMass": 0.0,
        "exactMass": 0.0,
        "xlogp": 0.0,
        "charge": 0,
        "heavyAtomCount": 10,
        "atomStereoCount": 0,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 0,
        "casId": null,
        "femaNumber": null,
        "femaFlavorProfile": null,
        "odor": null,
        "taste": null,
        "functionalGroups": null,
        "inchi": null,
        "volume3d": 0.0,
        "foodDbFlavorProfile": null,
        "superSweet": null,
        "bitter": 0.0,
        "superSweetDbId": 0.0,
        "bitterDbId": 0.0,
        "foodDbId": null,
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": null
    },...etc.
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/by-heavyAtomCount?heavy_atom_count=0`  
**Output**: `[]`

------
**Endpoint**: `/api/molecules_data/filter-by-weight-from`

**HTTP Method**: GET

**Inputs**: Query parameter: `from` 

**Example**: `/api/molecules_data/filter-by-weight-from?from=3000`
**Response-Time**: 58 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fd8",
        "pubchemId": 4,
        "iupacName": "1-aminopropan-2-ol",
        "commonName": "1-Aminopropan-2-ol",
        "smile": "CC(CN)O",
        "molecularWeight": 75.111,
        "hbdCount": 2,
        "hbaCount": 2,
        "numRotatableBonds": 1,
        "complexity": 22.9,
        "topologicalPolarSurfaceArea": 46.2,
        "monoisotopicMass": 75.068,
        "exactMass": 75.068,
        "xlogp": -1.0,
        "charge": 0,
        "heavyAtomCount": 5,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "2799-17-9@78-96-6@2799-16-8",
        "femaNumber": "3965",
        "femaFlavorProfile": "NaN",
        "odor": "slight ammonia odor",
        "taste": "NaN",
        "functionalGroups": "hydroxy compound@alcohol@secondary alcohol@1,2-aminoalcohol@amine@primary amine@primary aliphatic amine (alkylamine)",
        "inchi": "InChI=1S/C3H9NO/c1-3(5)2-4/h3,5H,2,4H2,1H3",
        "volume3d": 63.3,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB008936",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    },...etc
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/filter-by-weight-from?from=123456`  
**Output**: `[]`
	
------
**Endpoint**: `/api/molecules_data/filter-by-weight-range`

**HTTP Method**: GET

**Inputs**: Query parameter: `from` 

**Example**: `/api/molecules_data/filter-by-weight-range?from=2000&to=2150`
**Response-Time**: 63 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545ec5be",
        "pubchemId": 59872360,
        "iupacName": "actinium;1-[3,4,5-trihydroxy-6-(hydroxymethyl)oxan-2-yl]oxyhexane-2,3,4,5-tetrol",
        "commonName": "CID 59872360",
        "smile": "CC(C(C(C(COC1C(C(C(C(O1)CO)O)O)O)O)O)O)O.[Ac].[Ac].[Ac].[Ac].[Ac].[Ac].[Ac].[Ac]",
        "molecularWeight": 2144.536,
        "hbdCount": 8,
        "hbaCount": 10,
        "numRotatableBonds": 7,
        "complexity": 354.0,
        "topologicalPolarSurfaceArea": 180.0,
        "monoisotopicMass": 2144.359,
        "exactMass": 2144.359,
        "xlogp": "NaN",
        "charge": 0,
        "heavyAtomCount": 30,
        "atomStereoCount": 9,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 9,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 9,
        "casId": "NaN",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "acetal@hydroxy compound@alcohol@primary alcohol@secondary alcohol@1,2-diol@heterocyclic compound",
        "inchi": "InChI=1S/C12H24O10.8Ac/c1-4(14)7(16)8(17)5(15)3-21-12-11(20)10(19)9(18)6(2-13)22-12;;;;;;;;/h4-20H,2-3H2,1H3;;;;;;;;",
        "volume3d": "NaN",
        "foodDbFlavorProfile": "NaN",
        "superSweet": "Sweet-like",
        "bitter": 0.0,
        "superSweetDbId": 20450.0,
        "bitterDbId": "NaN",
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 1,
        "flavorProfile": "sweet-like"
    }
]
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/filter-by-weight-range?from=0&to=0`  
**Output**: `[]`

------
**Endpoint**: `/api/molecules_data/filter-by-hbd-count`

**HTTP Method**: GET

**Inputs**: Query parameter: `from` 

**Example**: `/api/molecules_data/filter-by-hbd-count?hbdCount=25`
**Response-Time**:55 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545ea2d5",
        "pubchemId": 16129778,
        "iupacName": "NaN",
        "commonName": "Tannic Acid",
        "smile": "C1=C(C=C(C(=C1O)O)O)C(=O)OC2=CC(=CC(=C2O)O)C(=O)OCC3C(C(C(C(O3)OC(=O)C4=CC(=C(C(=C4)OC(=O)C5=CC(=C(C(=C5)O)O)O)O)O)OC(=O)C6=CC(=C(C(=C6)OC(=O)C7=CC(=C(C(=C7)O)O)O)O)O)OC(=O)C8=CC(=C(C(=C8)OC(=O)C9=CC(=C(C(=C9)O)O)O)O)O)OC(=O)C1=CC(=C(C(=C1)OC(=O)C1=CC(=C(C(=C1)O)O)O)O)O",
        "molecularWeight": 1701.206,
        "hbdCount": 25,
        "hbaCount": 46,
        "numRotatableBonds": 31,
        "complexity": 3570.0,
        "topologicalPolarSurfaceArea": 778.0,
        "monoisotopicMass": 1700.173,
        "exactMass": 1700.173,
        "xlogp": 6.2,
        "charge": 0,
        "heavyAtomCount": 122,
        "atomStereoCount": 5,
        "definedAtomStereoCenterCount": 5,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "1401-55-4@5424-20-4",
        "femaNumber": "3042",
        "femaFlavorProfile": "NaN",
        "odor": "faint characteristic odor",
        "taste": "astringent taste",
        "functionalGroups": "hydroxy compound@phenol or hydroxyhetarene@1,2-diphenol@carboxylic acid derivative@carboxylic acid ester@aromatic compound@heterocyclic compound",
        "inchi": "InChI=1S/C76H52O46/c77-32-1-22(2-33(78)53(32)92)67(103)113-47-16-27(11-42(87)58(47)97)66(102)112-21-52-63(119-72(108)28-12-43(88)59(98)48(17-28)114-68(104)23-3-34(79)54(93)35(80)4-23)64(120-73(109)29-13-44(89)60(99)49(18-29)115-69(105)24-5-36(81)55(94)37(82)6-24)65(121-74(110)30-14-45(90)61(100)50(19-30)116-70(106)25-7-38(83)56(95)39(84)8-25)76(118-52)122-75(111)31-15-46(91)62(101)51(20-31)117-71(107)26-9-40(85)57(96)41(86)10-26/h1-20,52,63-65,76-101H,21H2/t52-,63-,64+,65-,76+/m1/s1",
        "volume3d": "NaN",
        "foodDbFlavorProfile": "NaN",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 1,
        "synthetic": 0,
        "flavorProfile": "NaN"
    },
    {
        "id": "6784f1c1e07c0c5b545ea956",
        "pubchemId": 19429218,
        "iupacName": "2,3,4,5,6-pentahydroxyhexanal",
        "commonName": "CID 19429218",
        "smile": "C(C(C(C(C(C=O)O)O)O)O)O.C(C(C(C(C(C=O)O)O)O)O)O.C(C(C(C(C(C=O)O)O)O)O)O.C(C(C(C(C(C=O)O)O)O)O)O.C(C(C(C(C(C=O)O)O)O)O)O",
        "molecularWeight": 900.78,
        "hbdCount": 25,
        "hbaCount": 30,
        "numRotatableBonds": 25,
        "complexity": 138.0,
        "topologicalPolarSurfaceArea": 591.0,
        "monoisotopicMass": 900.317,
        "exactMass": 900.317,
        "xlogp": "NaN",
        "charge": 0,
        "heavyAtomCount": 60,
        "atomStereoCount": 20,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 20,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 5,
        "casId": "NaN",
        "femaNumber": "NaN",
        "femaFlavorProfile": "NaN",
        "odor": "NaN",
        "taste": "NaN",
        "functionalGroups": "carbonyl compound@aldehyde@hydroxy compound@alcohol@primary alcohol@secondary alcohol@1,2-diol",
        "inchi": "InChI=1S/5C6H12O6/c5*7-1-3(9)5(11)6(12)4(10)2-8/h5*1,3-6,8-12H,2H2",
        "volume3d": "NaN",
        "foodDbFlavorProfile": "NaN",
        "superSweet": "Sweet",
        "bitter": 0.0,
        "superSweetDbId": 5996.0,
        "bitterDbId": "NaN",
        "foodDbId": "NaN",
        "flavorNetId": 0,
        "fenoroliAndOs": 0,
        "natural": 0,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "sweet"
    }
]
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/filter-by-hbd-count?hbdCount=30`  
**Output**: `[]`

------
**Endpoint**: `/api/molecules_data/filter-by-hba-count`

**HTTP Method**: GET

**Inputs**: Query parameter: `hbaCount` 

**Example**: `/api/molecules_data/filter-by-hba-count?hbaCount=1`
**Response-Time**: 479 ms
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fe7",
        "pubchemId": 177,
        "iupacName": "acetaldehyde",
        "commonName": "acetaldehyde",
        "smile": "CC=O",
        "molecularWeight": 44.053,
        "hbdCount": 0,
        "hbaCount": 1,
        "numRotatableBonds": 0,
        "complexity": 10.3,
        "topologicalPolarSurfaceArea": 17.1,
        "monoisotopicMass": 44.026,
        "exactMass": 44.026,
        "xlogp": -0.3,
        "charge": 0,
        "heavyAtomCount": 3,
        "atomStereoCount": 0,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 0,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "75-07-0",
        "femaNumber": "2003",
        "femaFlavorProfile": "Floral, Green Apple",
        "odor": "pungent, fruity odor@pungent, suffocating odor that is somewhat fruity and quite pleasant in dilute concentrations.",
        "taste": "tart taste (fruits containing acetaldehyde before ripening)",
        "functionalGroups": "carbonyl compound@aldehyde",
        "inchi": "InChI=1S/C2H4O/c1-2-3/h2H,1H3",
        "volume3d": 39.9,
        "foodDbFlavorProfile": "ethereal@ether@whiskey@pungent@fruity@aldehydic",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB008297",
        "flavorNetId": 1,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "ethereal@ether@whiskey@pungent@fruity@aldehydic"
    },..etc.
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/filter-by-hba-count?hbaCount=39`  
**Output**: `[]`
	
------
**Endpoint**: `/api/molecules_data/filter-by-type`

**HTTP Method**: GET

**Inputs**: Query parameter: `type` 

**Example**: `/api/molecules_data/filter-by-type?type=Natural`
**Response-Time**: 9.48 s
 
**Output**:

```json
[
    {
        "id": "6784f1c1e07c0c5b545e7fd8",
        "pubchemId": 4,
        "iupacName": "1-aminopropan-2-ol",
        "commonName": "1-Aminopropan-2-ol",
        "smile": "CC(CN)O",
        "molecularWeight": 75.111,
        "hbdCount": 2,
        "hbaCount": 2,
        "numRotatableBonds": 1,
        "complexity": 22.9,
        "topologicalPolarSurfaceArea": 46.2,
        "monoisotopicMass": 75.068,
        "exactMass": 75.068,
        "xlogp": -1.0,
        "charge": 0,
        "heavyAtomCount": 5,
        "atomStereoCount": 1,
        "definedAtomStereoCenterCount": 0,
        "undefinedAtomStereoCenterCount": 1,
        "bondStereoCount": 0,
        "definedBondStereoCenterCount": 0,
        "undefinedBondStereoCenterCount": 0,
        "isotopeAtomCount": 0,
        "covalentlyBondedUnitCount": 1,
        "casId": "2799-17-9@78-96-6@2799-16-8",
        "femaNumber": "3965",
        "femaFlavorProfile": "NaN",
        "odor": "slight ammonia odor",
        "taste": "NaN",
        "functionalGroups": "hydroxy compound@alcohol@secondary alcohol@1,2-aminoalcohol@amine@primary amine@primary aliphatic amine (alkylamine)",
        "inchi": "InChI=1S/C3H9NO/c1-3(5)2-4/h3,5H,2,4H2,1H3",
        "volume3d": 63.3,
        "foodDbFlavorProfile": "fishy",
        "superSweet": "NaN",
        "bitter": 0.0,
        "superSweetDbId": "NaN",
        "bitterDbId": "NaN",
        "foodDbId": "FDB008936",
        "flavorNetId": 0,
        "fenoroliAndOs": 1,
        "natural": 1,
        "unknownNatural": 0,
        "synthetic": 0,
        "flavorProfile": "fishy"
    },...etc.
```
**Error**:  

**URL**: `localhost:8080/api/molecules_data/filter-by-type?type=nat`  
**Output**: `[]`			

### 2. FN Properties

**Endpoint**: `/api/properties/by-coe`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `coe_no` (String)  
**Example**: `/api/properties/by-coe?coe_no=442`
**Response Time**: 78 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d88bb",
        "name": "ALLYL 10-UNDECENOATE",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Allyl undecylenate...",
        "casNo": "7493-76-7",
        ...
        "description": "Allyl 10-undecenoate has a fruital aroma suggestive of pineapple",
        "iofiCategorisation": "Artificial"
    }
]

```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-coe?coe_no=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-coe?coe_no=0`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "fn_properties_data not found with CoeNo : 0",
    "details": "uri=/api/properties/by-coe"
}
```

**URL**: `http://localhost:8080/api/properties/by-coe?coe_no=`  
**Output**:
```json
{
    "statusCode": 400,
    "message": "CoeNo cannot be null or empty",
    "details": "uri=/api/properties/by-coe"
}
```
----------


**Endpoint**: `/api/properties/by-fema`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `fema_no` (Double)  
**Example**: `/api/properties/by-fema?fema_no=2052`
**Response Time**: 59 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d88c6",
        "name": "Ambrette Tincture",
        ...
        "description": "Ambrette seed tincture is reported to find greatest use in liqueurs...",
        "iofiCategorisation": "Natural"
    }
]

```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-fema?fema_no=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-fema?fema_no=0`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "fn_properties_data not found with FemaNo : 0.0",
    "details": "uri=/api/properties/by-fema"
}
```

----------


**Endpoint**: `/api/properties/synthesis`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `values`  
**Example**: `/api/properties/synthesis?values=Synthetic`
**Response Time**: 191 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d886f",
        "name": "ACETIC ACID",
        ...
        "description": "Acetic acid, CH3COOH, is a colorless, volatile liquid at ambient temperatures...",
        "iofiCategorisation": "Natural"
    }
]

```

**Error**:  
**URL**: `http://localhost:8080/api/properties/synthesis?values=ABC`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/synthesis?values=abc`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "Synthesis not found: abc"
}
```
----------

**Removed this API Endpoint as it was not working properly and no data was matching this field**
**Endpoint**: `/api/properties/food-category`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `values` 
**Example**: `/api/properties/food-category?values=Dairy`
**Response Time**: 98 ms

**Output**:

```json
{
	"timestamp":  "2025-01-28T10:03:25.572+00:00",
	"status":  500,
	"error":  "Internal Server Error",
	"path":  "/api/properties/food-category"
}

```

----------

**Endpoint**: `/api/properties/by-einecs`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `einecs_no` 
**Example**: `/api/properties/by-einecs?einecs_no=234-216-3`
**Response Time**: 56 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d887e",
        "name": "3-ACETYL-2,5-DIMETHYLFURAN",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "2,5-Dimethyl-3-acetyl furan; 1-(2,5-Dimethyl-3-furyl)ethan-1-one",
        "casNo": "10599-70-9",
        "flNo": "13.066",
        "femaNo": 3391.0,
        "nasNo": "3391",
        "coeNo": "10921",
        "coeApproval": "NaN",
        "einecsNo": "234-216-3",
        "fda": "NaN",
        "femaGras": null,
        "jecfaNo": "1506",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Reported found in coffee",
        "tradeAssociationGuidelines": "1.048 mg",
        "aromaThresholdValues": "musty, earthy, nutty, raw potato, slightly green with a roasted almond nuance ",
        "description": "It is a liquid with a powerful, slightly roasted, nut-like aroma ",
        "iofiCategorisation": "Artificial"
    }
]

```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-einecs?einecs_no=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-einecs?einecs_no=0`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "fn_properties_data not found with EinecsNo : 0",
    "details": "uri=/api/properties/by-einecs"
}
```
----------

**Endpoint**: `//api/properties/taste-threshold`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `values` 
**Example**: `/api/properties/taste-threshold?values=Low`
**Response Time**: 324 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d89b2",
        "name": "CAPSICUM*",
        "botanicalName": "Capsicum minimum Mill , C. frutescens L , C. annuum L , and similar varieties of the species",
        "botanicalFamily": "Solanaceae",
        "synonyms": "Cayenne pepper; Red pepper; paprika; Capsicum peppers",
        "casNo": "NaN",
        "flNo": "NaN",
        "femaNo": "NaN",
        "nasNo": "6180",
        "coeNo": "NaN",
        "coeApproval": "NaN",
        "einecsNo": "NaN",
        "fda": "21 CFR 73.340, 182.10, 582.10",
        "femaGras": null,
        "jecfaNo": "NaN",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "Fluid extracts, tincture (10% in 90% ethanol, or 20% in 60% ethanol) and oleoresins (also plated onto inert carrier) ",
        "derivativeNames": "Capsicum oleoresin, Paprika oleoresin, Red pepper oleoresin",
        "note": "NaN",
        "foreignNames": "Piment Caraibe or Poivron Rouge (Fr ), Cayenne Pfeffer (Ger ), Pipienta chiles (Sp ), Capsico (It )",
        "essentialOilComposition": "The best-known constituent accounting for the pungent flavor is decylene vanillylamide (also known as capsaicin), a very pungent phenolic chemical. Capsicum contains about 1.5% of an irritating oleoresin. The major component of the oil is capsaicin (0.02%). The pungency appears to be related to the presence of a 4-hydroxy-3-methoxyphenyl substituent ",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "NaN",
        "tradeAssociationGuidelines": "NaN",
        "aromaThresholdValues": "NaN",
        "description": "Under the name of capsicum, the fruits of various species of the family Solanaceae are used extensively as pungent food additives. Commercially, the fruits of Capsicum annuum and its varieties are known under the names of Spanish pepper, poivrons and paprika. The fruits of C. frutescens are known as chiles, although the term chiles may be used to indicate any variety of capsi-cum. The orange-red powder of the fruits from which the most pungent parts are removed is known as rosenpaprika. In the United States, this is simply paprika. It is recognized that approximately five species and their hybrids contribute to all sources of “peppers ” The fruits are the part used. Capsicum is mild to highly pungent. Capsicum was first described in the late 1400s by a physician who accompanied Columbus to the West Indies Capsicum frutescens:C. frutescens is a small shrub similar to other capsicum species native to South America. It has a 2- to 3-year life span, reaches a height of 1 m, has greenish-yellow flowers clustered at the base of lanceolate leaves and has small oblong, intensely red pods 1 to 3 cm long. Capsicum annum:C. annuum is an annual, shrub-like herb smaller than C. frutescens, with a woody stem and single, white flowers located at the junction of the isolated leaves. The oblong pods (fruits) exhibit varying colors — yellow to red to black. The fruits of C. annuum have a taste less pungent than C. frutescens ",
        "iofiCategorisation": "NaN"
    },
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/taste-threshold?values=meduim`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/taste-threshold?values=medium`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "Taste Threshold not found: medium"
}
```

----------

**Endpoint**: `/api/properties/by-flNo`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `fl_no` 
**Example**: `/api/properties/by-flNo?fl_no=6.001`
**Response Time**: 85 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d8864",
        "name": "ACETAL",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Acetaldehyde diethyl acetal; Acetaldehyde ethyl acetal; Acetol; Diethylacetal; Dithane, 1,1-diethoxy-; Ethylidene diethyl ether; Ethylidenediethyl ether; 1,1-Diethoxyethane",
        "casNo": "105-57-7",
        "flNo": "6.001",
        "femaNo": 2002.0,
        "nasNo": "2002",
        "coeNo": "35",
        "coeApproval": "20 ppm",
        "einecsNo": "203-310-6",
        "fda": "21 CFR 172.515",
        "femaGras": null,
        "jecfaNo": "941",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Present in some liquors (e g , sake, whiskey and cognac); also detected and quantitatively assessed in rums. Found in apple juice, orange juice, orange peel oil, bitter orange juice, strawberry fruit, raw radish, Chinese quince fruit, Chinese quince flesh, udo (Aralia cordata Thunb ) ",
        "tradeAssociationGuidelines": "11.580 mg",
        "aromaThresholdValues": "4 to 42 ppb",
        "description": "Acetal has a refreshing, pleasant, fruity-green odor ",
        "iofiCategorisation": "Nature Identical"
    }
]
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-flNo?fl_no=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-flNo?fl_no=0`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "fn_properties_data not found with FlNo : 0",
    "details": "uri=/api/properties/by-flNo"
}
```

----------

**Endpoint**: `/api/properties/by-nas`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `nas_no` 
**Example**: `/api/properties/by-nas?nas_no=2002`
**Response Time**: 86 ms 

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d8864",
        "name": "ACETAL",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Acetaldehyde diethyl acetal; Acetaldehyde ethyl acetal; Acetol; Diethylacetal; Dithane, 1,1-diethoxy-; Ethylidene diethyl ether; Ethylidenediethyl ether; 1,1-Diethoxyethane",
        "casNo": "105-57-7",
        "flNo": "6.001",
        "femaNo": 2002.0,
        "nasNo": "2002",
        "coeNo": "35",
        "coeApproval": "20 ppm",
        "einecsNo": "203-310-6",
        "fda": "21 CFR 172.515",
        "femaGras": null,
        "jecfaNo": "941",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Present in some liquors (e g , sake, whiskey and cognac); also detected and quantitatively assessed in rums. Found in apple juice, orange juice, orange peel oil, bitter orange juice, strawberry fruit, raw radish, Chinese quince fruit, Chinese quince flesh, udo (Aralia cordata Thunb ) ",
        "tradeAssociationGuidelines": "11.580 mg",
        "aromaThresholdValues": "4 to 42 ppb",
        "description": "Acetal has a refreshing, pleasant, fruity-green odor ",
        "iofiCategorisation": "Nature Identical"
    }
]
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-nas?nas_no=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-nas?nas_no=0`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "fn_properties_data not found with NasNo : 0",
    "details": "uri=/api/properties/by-nas"
}
```

----------

**Endpoint**: `/api/properties/by-jecfa`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `jecfa_no` 
**Example**: `/api/properties/by-jecfa?jecfa_no=810`
**Response Time**: 46 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d886e",
        "name": "ACETANISOLE",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Acetophenone,. 4ʹ-methoxy-;  4-Acetylanisole;  p-Acetylanisole;  Ethanone,. 1-(4-methoxyphenyl)-;  Linarodin; 4ʹ-Methoxyacetophenone;  4-Methoxyacetophenone;  p-Methoxyacetophenone;  1-(4-Methoxyphenyl)ethanone;  p-Methoxyphenyl methyl ketone; Methyl p-methoxyphenyl ketone; 4-Methoxyphenyl methyl ketone; Novatone; Vananote",
        "casNo": "0100-06-01",
        "flNo": "7.038",
        "femaNo": 2005.0,
        "nasNo": "2005",
        "coeNo": "570",
        "coeApproval": "20 ppm",
        "einecsNo": "202-815-9",
        "fda": "21 CFR 172.515",
        "femaGras": null,
        "jecfaNo": "810",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Reported found in European cranberry (Vaccinium oxycoccus L ), guava fruit (Psidium guajava L ), Vitis labrusca L , tomato, anise (Pimpinella anisum L ), mentha oils, grilled and roasted beef, sherry, cloudberry (Rubus chamaemorus L ), salted and pickled plums, Illicium verum and black chokeberry (Aronia melanocarpa ell ) ",
        "tradeAssociationGuidelines": "9.088 mg.",
        "aromaThresholdValues": "NaN",
        "description": "Yellowish-white crystals with an odor similar to that of p-methylacetopheneone, suggestive of hawthorn and floral note of heliotrope, possessing a bitter and unpleasant taste. Useful in vanilla, nut, tobacco and butter flavors ",
        "iofiCategorisation": "Nature Identical"
    }
]
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-jecfa?jecfa_no=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-jecfa?jecfa_no=8100`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "fn_properties_data not found with JecfaNo : 8100",
    "details": "uri=/api/properties/by-jecfa"
}
```

----------
**Endpoint**: `/api/properties/by-tradeAssociationGuidelines`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `guideline` 
**Example**: `/api/properties/by-tradeAssociationGuidelines?guideline=9.088 mg.`
**Response Time**: 42 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d886e",
        "name": "ACETANISOLE",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Acetophenone,. 4ʹ-methoxy-;  4-Acetylanisole;  p-Acetylanisole;  Ethanone,. 1-(4-methoxyphenyl)-;  Linarodin; 4ʹ-Methoxyacetophenone;  4-Methoxyacetophenone;  p-Methoxyacetophenone;  1-(4-Methoxyphenyl)ethanone;  p-Methoxyphenyl methyl ketone; Methyl p-methoxyphenyl ketone; 4-Methoxyphenyl methyl ketone; Novatone; Vananote",
        "casNo": "0100-06-01",
        "flNo": "7.038",
        "femaNo": 2005.0,
        "nasNo": "2005",
        "coeNo": "570",
        "coeApproval": "20 ppm",
        "einecsNo": "202-815-9",
        "fda": "21 CFR 172.515",
        "femaGras": null,
        "jecfaNo": "810",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Reported found in European cranberry (Vaccinium oxycoccus L ), guava fruit (Psidium guajava L ), Vitis labrusca L , tomato, anise (Pimpinella anisum L ), mentha oils, grilled and roasted beef, sherry, cloudberry (Rubus chamaemorus L ), salted and pickled plums, Illicium verum and black chokeberry (Aronia melanocarpa ell ) ",
        "tradeAssociationGuidelines": "9.088 mg.",
        "aromaThresholdValues": "NaN",
        "description": "Yellowish-white crystals with an odor similar to that of p-methylacetopheneone, suggestive of hawthorn and floral note of heliotrope, possessing a bitter and unpleasant taste. Useful in vanilla, nut, tobacco and butter flavors ",
        "iofiCategorisation": "Nature Identical"
    }
]
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-tradeAssociationGuidelines?guideline=0 mg`  
**Output**: `[]`

----------
**Endpoint**: `/api/properties/by-coe-approval`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `coe_approval` 
**Example**: `/api/properties/by-coe-approval?coe_approval=Approved`
**Response Time**: 256 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d886f",
        "name": "ACETIC ACID",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Acetic acid, glacial [USAN:JAN]; Ethanoic acid; Acetic acid glacial; Acetic acid (aqueous solution); Ethylic acid; Methanecarboxylic acid; Pyroligneous acid; Vinegar acid; Vosol; Acetic acid, of a concentration of more than 10%, by weight of acetic acid",
        "casNo": "64-19-7",
        "flNo": "8.002",
        "femaNo": 2006.0,
        "nasNo": "2006",
        "coeNo": "2",
        "coeApproval": "Approved",
        "einecsNo": "200-580-7",
        "fda": "21 CFR 131.111, 133 et seq , 169 et seq , 173 et seq , 184.1005, 582.1005; 27 CFR 4.21, 5.22, 21 et seq , 24 et seq ",
        "femaGras": null,
        "jecfaNo": "81",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Reported found in vinegar, bergamot, cornmint oil, bitter orange oil, lemon petitgrain, various dairy products ",
        "tradeAssociationGuidelines": "2.146 mg.",
        "aromaThresholdValues": "Aroma characteristics at 1.0%; sour pungent, cider vinegar, slightly malty with a brown nuance ",
        "description": "Acetic acid, CH3COOH, is a colorless, volatile liquid at ambient temperatures. The pure compound, glacial acetic acid, owes its name to its ice-like crystalline appearance at 15.6°C. As generally supplied, acetic acid is a 6 N aqueous solution (about 36%) or a 1 N solution (about 6%). These or other dilutions are used in adding appropriate amounts of acetic acid to foods. Acetic acid is the characteristic acid of vinegar, its concentration ranging from 3.5 to 5.6%. Acetic acid and acetates are present in most plants and animal tissues in small but detectable amounts. They are normal metabolic intermediates, are produced by such bacterial species as Acetobacter and can be synthesized completely from carbon dioxide by such microorganisms as Clostridium thermoaceticum. The rat forms acetate at the rate of 1% of its body weight per day As a colorless liquid with a strong, pungent, characteristic vinegar odor, it is useful in butter, cheese, grape and fruit flavors. Very little pure acetic acid as such is used in foods, although it is classified by FDA as a GRAS material. Consequently, it may be employed in products that are not covered by Definitions and Standards of Identity. Acetic acid is the principal component of vinegars and pyroligneous acid. In the form of vinegar, more than 27 million lb were added to food in 1986, with approximately equal amounts used as acidulants and flavoring agents. In fact, acetic acid (as vinegar) was one of the earliest flavoring agents. Vinegars are used extensively in preparing salad dressing and mayonnaise, sour and sweet pickles and numerous sauces and cat-sups. They are also used in the curing of meat and in the canning of certain vegetables. In the manufacture of mayonnaise, the addition of a portion of acetic acid (vinegar) to the salt- or sugar-yolk reduces the heat resistance of Salmonella. Water binding compositions of sausages often include acetic acid or its sodium salt, while calcium acetate is used to preserve the texture of sliced, canned vegetables ",
        "iofiCategorisation": "Natural"
    },...etc. 
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-coe-approval?coe_approval=cancel`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-coe-approval?coe_approval=cancel`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "CoE Approval not found: cancel"
}
```

----------
**Endpoint**: `/api/properties/by-iofi-categorisation`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `category` 
**Example**: `by-iofi-categorisation?category=Nature Identical`
**Response Time**: 916 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d886e",
        "name": "ACETANISOLE",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Acetophenone,. 4ʹ-methoxy-;  4-Acetylanisole;  p-Acetylanisole;  Ethanone,. 1-(4-methoxyphenyl)-;  Linarodin; 4ʹ-Methoxyacetophenone;  4-Methoxyacetophenone;  p-Methoxyacetophenone;  1-(4-Methoxyphenyl)ethanone;  p-Methoxyphenyl methyl ketone; Methyl p-methoxyphenyl ketone; 4-Methoxyphenyl methyl ketone; Novatone; Vananote",
        "casNo": "0100-06-01",
        "flNo": "7.038",
        "femaNo": 2005.0,
        "nasNo": "2005",
        "coeNo": "570",
        "coeApproval": "20 ppm",
        "einecsNo": "202-815-9",
        "fda": "21 CFR 172.515",
        "femaGras": null,
        "jecfaNo": "810",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Reported found in European cranberry (Vaccinium oxycoccus L ), guava fruit (Psidium guajava L ), Vitis labrusca L , tomato, anise (Pimpinella anisum L ), mentha oils, grilled and roasted beef, sherry, cloudberry (Rubus chamaemorus L ), salted and pickled plums, Illicium verum and black chokeberry (Aronia melanocarpa ell ) ",
        "tradeAssociationGuidelines": "9.088 mg.",
        "aromaThresholdValues": "NaN",
        "description": "Yellowish-white crystals with an odor similar to that of p-methylacetopheneone, suggestive of hawthorn and floral note of heliotrope, possessing a bitter and unpleasant taste. Useful in vanilla, nut, tobacco and butter flavors ",
        "iofiCategorisation": "Nature Identical"
    },..etc 
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-iofi-categorisation?category=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-iofi-categorisation?category=0`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "IOFI Categorisation not found: 0"
}
```

----------
**Endpoint**: `/api/properties/by-naturalOccurrence`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `occurrence` 
**Example**: `/api/properties/by-naturalOccurrence?occurrence=Natural`
**Response Time**: 46 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d92f0",
        "name": "VETIVEROL",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "6-Azulenol, 1,2,3,3a,4,5,6,8a-octahydro-4,8-dimethyl-2-(1-methylethylidene)-; 1,2,3,3a,4,5,6,8a-Octahydro-2-isopropylidene-4,8-dimethylazulen-6-ol; Vetivenol; Vetivol; Hydroxymethylisoprop-5-enyl-tricyclo[6 2 1 0(3 7]undecane",
        "casNo": "89-88-3",
        "flNo": "2.214",
        "femaNo": 4217.0,
        "nasNo": "NaN",
        "coeNo": "10321",
        "coeApproval": "NaN",
        "einecsNo": "201-949-5",
        "fda": "NaN",
        "femaGras": null,
        "jecfaNo": "1866",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Natural",
        "tradeAssociationGuidelines": "3.689 mg",
        "aromaThresholdValues": "Medium strength odor, woody type ",
        "description": "Amber solid; sweet balsamic aroma",
        "iofiCategorisation": "Artificial"
    },...etc
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-naturalOccurrence?occurrence=0`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-naturalOccurrence?occurrence=0`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "Natural Occurrence not found: 0"
}
```


----------

**Endpoint**: `/api/properties/by-aromaThresholdValues`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `threshold` 
**Example**: `/api/properties/by-aromaThresholdValues?threshold=4 to 42 ppb`
**Response Time**: 49 ms

**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d8864",
        "name": "ACETAL",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Acetaldehyde diethyl acetal; Acetaldehyde ethyl acetal; Acetol; Diethylacetal; Dithane, 1,1-diethoxy-; Ethylidene diethyl ether; Ethylidenediethyl ether; 1,1-Diethoxyethane",
        "casNo": "105-57-7",
        "flNo": "6.001",
        "femaNo": 2002.0,
        "nasNo": "2002",
        "coeNo": "35",
        "coeApproval": "20 ppm",
        "einecsNo": "203-310-6",
        "fda": "21 CFR 172.515",
        "femaGras": null,
        "jecfaNo": "941",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Present in some liquors (e g , sake, whiskey and cognac); also detected and quantitatively assessed in rums. Found in apple juice, orange juice, orange peel oil, bitter orange juice, strawberry fruit, raw radish, Chinese quince fruit, Chinese quince flesh, udo (Aralia cordata Thunb ) ",
        "tradeAssociationGuidelines": "11.580 mg",
        "aromaThresholdValues": "4 to 42 ppb",
        "description": "Acetal has a refreshing, pleasant, fruity-green odor ",
        "iofiCategorisation": "Nature Identical"
    }
]
```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-aromaThresholdValues?threshold=1`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-aromaThresholdValues?threshold=4`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "Aroma Threshold Values not found: 4 "
}
```

----------


**Endpoint**: `//api/properties/by-description`  
**HTTP Method**: GET  
**Inputs**: Query parameter: `desc` 
**Example**: `/api/properties/by-description?desc=Acetaldehyde`
**Response Time**: 125 ms
**Output**:

```json
[
    {
        "id": "6784f1aee07c0c5b545d8865",
        "name": "ACETALDEHYDE",
        "botanicalName": "NaN",
        "botanicalFamily": "NaN",
        "synonyms": "Ethanal; Acetic aldehyde; Acetylaldehyde; Ethyl aldehyde",
        "casNo": "75-07-0",
        "flNo": "5.001",
        "femaNo": 2003.0,
        "nasNo": "2003",
        "coeNo": "89",
        "coeApproval": "20 ppm",
        "einecsNo": "200-836-8",
        "fda": "21 CFR 182.60, 582.60; 27 CFR 19.460, 21 et seq ",
        "femaGras": null,
        "jecfaNo": "80",
        "jecfaStatus": null,
        "additives": null,
        "ifraCategory": null,
        "reachNo": null,
        "scentRefLibrary": null,
        "fct": null,
        "notes": null,
        "derivatives": "NaN",
        "derivativeNames": "NaN",
        "note": "NaN",
        "foreignNames": "NaN",
        "essentialOilComposition": "NaN",
        "genusSpecies": "NaN",
        "composition": "NaN",
        "insNo": "NaN",
        "animalFamily": "NaN",
        "physicalChemicalCharacteristics": "NaN",
        "naturalOccurrence": "Reported found in oak and tobacco leaves; in the fruital aromas of pear, apple, raspberry, strawberry and pine-apple; in the distillation waters of Monarda punctata, orris, cumin, chenopodium; in the essential oils of Litsea cubeba, Magnolia grandiflora, Artemisia brevifolia, rosemary, balm, clary sage, Mentha arvensis, daffodil, bitter orange, camphor, angelica, fennel, mustard, Scotch blended whiskey, Japanese whiskey, rose wine, blackberry brandy and rum ",
        "tradeAssociationGuidelines": "35.261 mg.",
        "aromaThresholdValues": "27 to 380 ppb",
        "description": "Acetaldehyde is a colorless, flammable liquid with a characteristic pungent, penetrating, ethereal odor. As a flavor ingredient/enhancer, as, for example, in orange juice, acetaldehyde helps create naturalness, fruitiness and juiciness ",
        "iofiCategorisation": "Nature Identical"
    },..etc. 

```

**Error**:  
**URL**: `http://localhost:8080/api/properties/by-description?desc=abc`  
**Output**: `[]`

**Error Fixed**:
  **URL**: `http://localhost:8080/api/properties/by-description?desc=Abc`  
**Output**:
```json
{
    "statusCode": 404,
    "message": "Description not found: Abc"
}
```

----------

### 3. More Properties

**Endpoint**: `/api/more_properties/by-aromaticRings`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`aromatic_rings` (String)  
**Example**:  `/api/more_properties/by-aromaticRings?aromatic_rings=0`
**Response-Time**: 2.7s
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b6755",
        "pubchemId": 4,
        "numberOfAtoms": 5,
        "molecularFormula": "C3H9NO",
        "molecularComposition": "C: 0.480, H: 0.121, N: 0.186, O: 0.213",
        "molecularWeight": 75.1097,
        "molecularMass": 75.0684,
        "energy": 0.6,
        "alogp": -0.81,
        "logd": -1.7919999999999998,
        "molecularSolubility": 0.295,
        "pka": "9.61",
        "numberOfAromaticBonds": 0,
        "numberOfAromaticRings": 0,
        "hbaCount": 0,
        "hbdCount": 2,
        "numberOfHAcceptor": 2,
        "numberOfHAcceptorLipinski": 2,
        "numberOfHDonor": 2,
        "numberOfHDonorLipinski": 3,
        "numberOfHBonds": 0,
        "numRings": 0,
        "numRotatableBonds": 1,
        "surfaceArea": 104.15,
        "molecularSasa": 238.075,
        "radiusOfGyration": 0.95701,
        "molecular3dSasa": 207.859
    },....etc.
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-aromaticRings?aromatic_rings=6`

**Output**:

```json
[]

```
--------

**Endpoint**: `/api/more_properties/by-aromaticBonds`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`aromaticBonds` (String)  
**Example**:  `/api/more_properties/by-aromaticBonds?aromatic_bonds=6`
**Response-Time**: 1.02s
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b675c",
        "pubchemId": 72,
        "numberOfAtoms": 11,
        "molecularFormula": "C7H6O4",
        "molecularComposition": "C: 0.546, H: 0.039, O: 0.415",
        "molecularWeight": 154.12,
        "molecularMass": 154.02700000000002,
        "energy": 15.04,
        "alogp": 0.975,
        "logd": -0.659,
        "molecularSolubility": -0.703,
        "pka": "4.48\n7.55\n10.97",
        "numberOfAromaticBonds": 6,
        "numberOfAromaticRings": 1,
        "hbaCount": 1,
        "hbdCount": 2,
        "numberOfHAcceptor": 4,
        "numberOfHAcceptorLipinski": 4,
        "numberOfHDonor": 3,
        "numberOfHDonorLipinski": 3,
        "numberOfHBonds": 0,
        "numRings": 1,
        "numRotatableBonds": 1,
        "surfaceArea": 150.4,
        "molecularSasa": 301.931,
        "radiusOfGyration": 2.0242400000000003,
        "molecular3dSasa": 293.889
    },....etc.
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-aromaticBonds?aromatic_bonds=2`

**Output**:

```json
[]

```
--------

**Endpoint**: `/api/more_properties/by-numRings`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`numRings` (String)  
**Example**:  `/api/more_properties/by-numRings?num_rings=4`
**Response-Time**: 640ms
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b677b",
        "pubchemId": 274,
        "numberOfAtoms": 22,
        "molecularFormula": "C10H12N5O6P",
        "molecularComposition": "C: 0.365, H: 0.037, N: 0.213, O: 0.292, P: 0.094",
        "molecularWeight": 329.206,
        "molecularMass": 329.05300000000005,
        "energy": 92.28,
        "alogp": -1.555,
        "logd": -2.992,
        "molecularSolubility": 0.305,
        "pka": "3.79\n4.89",
        "numberOfAromaticBonds": 10,
        "numberOfAromaticRings": 2,
        "hbaCount": 6,
        "hbdCount": 2,
        "numberOfHAcceptor": 10,
        "numberOfHAcceptorLipinski": 11,
        "numberOfHDonor": 3,
        "numberOfHDonorLipinski": 4,
        "numberOfHBonds": 0,
        "numRings": 4,
        "numRotatableBonds": 1,
        "surfaceArea": 284.67,
        "molecularSasa": 454.509,
        "radiusOfGyration": 2.40947,
        "molecular3dSasa": 406.827
    },....etc.
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-numRings?num_rings=15`

**Output**:

```json
[]

```
--------

**Endpoint**: `/api/more_properties/by-rotatableBonds`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`rotatableBonds` (String)  
**Example**:  `/api/more_properties/by-rotatableBonds?rotatable_bonds=4`
**Response-Time**: 914ms
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b6759",
        "pubchemId": 51,
        "numberOfAtoms": 10,
        "molecularFormula": "C5H6O5",
        "molecularComposition": "C: 0.411, H: 0.041, O: 0.548",
        "molecularWeight": 146.09799999999998,
        "molecularMass": 146.02200000000002,
        "energy": 3.63,
        "alogp": -0.483,
        "logd": -3.338,
        "molecularSolubility": -0.77,
        "pka": "3.42\n5.32",
        "numberOfAromaticBonds": 0,
        "numberOfAromaticRings": 0,
        "hbaCount": 3,
        "hbdCount": 0,
        "numberOfHAcceptor": 5,
        "numberOfHAcceptorLipinski": 5,
        "numberOfHDonor": 2,
        "numberOfHDonorLipinski": 2,
        "numberOfHBonds": 0,
        "numRings": 0,
        "numRotatableBonds": 4,
        "surfaceArea": 150.57,
        "molecularSasa": 293.985,
        "radiusOfGyration": 1.95986,
        "molecular3dSasa": 287.607
    },....etc.
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-rotatableBonds?rotatable_bonds=a`

**Output**:

```json
[
	{
    "timestamp": "2025-01-28T11:20:31.669+00:00",
    "status": 400,
    "error": "Bad Request",
    "path": "/api/more_properties/by-rotatableBonds"
	}
]
```
--------


**Endpoint**: `/api/more_properties/by-surfaceArea`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`surfaceArea` (String)  
**Example**:  `api/more_properties/by-surfaceArea?surface_area=154.66`
**Response-Time**: 89ms
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b6757",
        "pubchemId": 47,
        "numberOfAtoms": 9,
        "molecularFormula": "C6H10O3",
        "molecularComposition": "C: 0.554, H: 0.077, O: 0.369",
        "molecularWeight": 130.142,
        "molecularMass": 130.063,
        "energy": 4.58,
        "alogp": 1.257,
        "logd": -0.217,
        "molecularSolubility": -1.3769999999999998,
        "pka": "2.29",
        "numberOfAromaticBonds": 0,
        "numberOfAromaticRings": 0,
        "hbaCount": 2,
        "hbdCount": 0,
        "numberOfHAcceptor": 3,
        "numberOfHAcceptorLipinski": 3,
        "numberOfHDonor": 1,
        "numberOfHDonorLipinski": 1,
        "numberOfHBonds": 0,
        "numRings": 0,
        "numRotatableBonds": 3,
        "surfaceArea": 154.66,
        "molecularSasa": 293.559,
        "radiusOfGyration": 1.48045,
        "molecular3dSasa": 280.635
    }
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-surfaceArea?surface_area=154.67`

**Output**:

```json
[]
```
--------

**Endpoint**: `/api/more_properties/by-alogp`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`alogp` (String)  
**Example**:  `http://localhost:8080/api/more_properties/by-alogp?alogp=1.257`
**Response-Time**: 117ms
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b6757",
        "pubchemId": 47,
        "numberOfAtoms": 9,
        "molecularFormula": "C6H10O3",
        "molecularComposition": "C: 0.554, H: 0.077, O: 0.369",
        "molecularWeight": 130.142,
        "molecularMass": 130.063,
        "energy": 4.58,
        "alogp": 1.257,
        "logd": -0.217,
        "molecularSolubility": -1.3769999999999998,
        "pka": "2.29",
        "numberOfAromaticBonds": 0,
        "numberOfAromaticRings": 0,
        "hbaCount": 2,
        "hbdCount": 0,
        "numberOfHAcceptor": 3,
        "numberOfHAcceptorLipinski": 3,
        "numberOfHDonor": 1,
        "numberOfHDonorLipinski": 1,
        "numberOfHBonds": 0,
        "numRings": 0,
        "numRotatableBonds": 3,
        "surfaceArea": 154.66,
        "molecularSasa": 293.559,
        "radiusOfGyration": 1.48045,
        "molecular3dSasa": 280.635
    },..etc.
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-alogp?alogp=1.3`

**Output**:

```json
[]
```
--------

**Endpoint**: `/api/more_properties/by-numberOfAtoms`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`numberOfAtoms` (String)  
**Example**:  `http://localhost:8080/api/more_properties/by-numberOfAtoms?number_of_atoms=9`
**Response-Time**: 222ms
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b6757",
        "pubchemId": 47,
        "numberOfAtoms": 9,
        "molecularFormula": "C6H10O3",
        "molecularComposition": "C: 0.554, H: 0.077, O: 0.369",
        "molecularWeight": 130.142,
        "molecularMass": 130.063,
        "energy": 4.58,
        "alogp": 1.257,
        "logd": -0.217,
        "molecularSolubility": -1.3769999999999998,
        "pka": "2.29",
        "numberOfAromaticBonds": 0,
        "numberOfAromaticRings": 0,
        "hbaCount": 2,
        "hbdCount": 0,
        "numberOfHAcceptor": 3,
        "numberOfHAcceptorLipinski": 3,
        "numberOfHDonor": 1,
        "numberOfHDonorLipinski": 1,
        "numberOfHBonds": 0,
        "numRings": 0,
        "numRotatableBonds": 3,
        "surfaceArea": 154.66,
        "molecularSasa": 293.559,
        "radiusOfGyration": 1.48045,
        "molecular3dSasa": 280.635
    },..etc.
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-numberOfAtoms?number_of_atoms=0`

**Output**:

```json
[]
```
--------

**Endpoint**: `/api/more_properties/by-energy`  
**HTTP Method**: `GET`  
**Inputs**Query Parameter:`energy` (String)  
**Example**:  `http://localhost:8080/api/more_properties/by-energy?energy=4.58`
**Response-Time**: 59ms
**Output**  
```json
[
    {
        "id": "6784f827e3c87da9c22b6757",
        "pubchemId": 47,
        "numberOfAtoms": 9,
        "molecularFormula": "C6H10O3",
        "molecularComposition": "C: 0.554, H: 0.077, O: 0.369",
        "molecularWeight": 130.142,
        "molecularMass": 130.063,
        "energy": 4.58,
        "alogp": 1.257,
        "logd": -0.217,
        "molecularSolubility": -1.3769999999999998,
        "pka": "2.29",
        "numberOfAromaticBonds": 0,
        "numberOfAromaticRings": 0,
        "hbaCount": 2,
        "hbdCount": 0,
        "numberOfHAcceptor": 3,
        "numberOfHAcceptorLipinski": 3,
        "numberOfHDonor": 1,
        "numberOfHDonorLipinski": 1,
        "numberOfHBonds": 0,
        "numRings": 0,
        "numRotatableBonds": 3,
        "surfaceArea": 154.66,
        "molecularSasa": 293.559,
        "radiusOfGyration": 1.48045,
        "molecular3dSasa": 280.635
    },..etc.
]
``` 
#### **Error Example**

**URL**: `http://localhost:8080/api/more_properties/by-energy?energy=5.58`

**Output**:

```json
[]
```
--------

