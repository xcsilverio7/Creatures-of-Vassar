# View Sighting

### Primary Actors and Goals

__Student__: Wants to view a sighting

__Database__: Wants to keep all pins in one place

### Preconditions
* The student has opened the app
* Student is looking at the map
* Student has tapped a pin currently displayed on the map


### Post-conditions
* Student is looking at a pin

### Workflow
```plantuml
@startuml
'define swimlanes
|#technology|Student|
|#implementation|System|

|System|
start
:Load photos from database;
:Display photos;
:Display timestamp;
if (ID been attached?) then (Yes)
:Display ID;
else (No)
endif
stop

```

### Sequence Diagram
```plantuml
@startuml
actor Student as student
participant " : PinViewFragment" as pvf
participant " : ControllerActivity" as controller
participant " pin : Pin" as pin
participant " : PinDatabase" as PinDatabase

pvf -> controller : onClick()
controller -> PinDatabase : viewPin()
PinDatabase -> pin : findPin()

```