# API Examples
All created entities will be return along with generated `id`s.

## Creating an Address
POST `/addresses/`

```json
{
  "city": "Some City",
  "street": "Some Street",
  "building": "42"
}
```

## Creating a Clinic
POST `/clinics/`

```json
{
  "name": "Some Clinic",
  "address": {
    "id": 1
  }
}
```

## Requesting a Clinic
GET `/clinics/1`

```json
{
  "id": 1,
  "name": "Some Clinic",
  "address": {
    "id": 1,
    "city": "Some City",
    "street": "Some Street",
    "building": "42"
  },
  "doctors": [],
  "patients": []
}
```

## Creating a Doctor
POST `/doctors/`

```json
{
  "username": "Some Doctor",
  "clinic": {
    "id": 1
  },
  "specialization": "someone"
}
```

## Requesting a Doctor
GET `/doctors/1`

```json
{
  "id": 1,
  "username": "Some Doctor",
  "clinic": {
    "id": 1
  },
  "specialization": "someone",
  "visits": []
}
```

## Creating a Patient
POST `/patients/`

```json
{
  "id": 2,
  "username": "Some Patient",
  "clinic": {
    "id": 1
  },
  "address": {
    "id": 1
  }
}
```

## Updating the Patient
PUT `/patients/2`

```json
{
  "id": 2,
  "username": "Updated Patient",
  "clinic": {
    "id": 1
  },
  "address": {
    "id": 1,
    "city": "Some City",
    "street": "Some Street",
    "building": "42"
  },
  "visits": [],
  "entries": []
}
```

## Creating a Visit
POST `/visits/`

```json
{
  "dateTime": "2024-02-22T12:00:28.349Z",
  "description": "some reason",
  "patient": {
    "id": 2
  },
  "doctor": {
    "id": 1
  },
  "clinic": {
    "id": 1
  }
}
```

## Upcoming Visits
GET `/patients/2/upcoming-visits`

```json
[
  {
    "id": 2,
    "dateTime": "2024-02-22T12:00:28.349Z",
    "description": "some reason",
    "patient": {
      "id": 2,
      "username": "Updated Patient"
    },
    "doctor": {
      "id": 1,
      "username": "Some Doctor",
      "specialization": "someone"
    },
    "clinic": {
      "id": 1,
      "name": "Some Clinic",
      "address": {
        "id": 1,
        "city": "Some City",
        "street": "Some Street",
        "building": "42"
      }
    }
  }
]
```