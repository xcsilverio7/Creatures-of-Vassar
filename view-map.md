# View Map

### Primary Actors and Goals

__Student__: Wants to view the map
 

### Preconditions
* The student has opened the app


### Post-conditions
* App has connected to google maps

### Workflow
```plantuml
@startuml
'define swimlanes
|#technology|Student|
|#implementation|System|

|System|
start
:Connect to Google maps;
if (Is Google Maps down?) then (Yes)
:Display error message;
stop
else (No)
endif
:Display google maps;
:Check pins on database;
:Set filters to default;
:Display pins on map;
|Student|
if (Change filters?) then (Yes)
|System|
:Redisplay pins;
else (No)
endif
stop
```

### Sequence Diagram

```plantuml
@startuml
actor Student as student
participant " : MapFragment" as MapFragment
participant " : ControllerActivity" as controller
participant ": PinDatabase" as pins




controller -> MapFragment: onCreate()
controller -> pins: getVisible()
controller -> MapFragment: viewPin()
student -> MapFragment: click change filter
MapFragment -> controller: changeFilter(Filter)
controller -> pins : setVisible(Filter)
controller -> pins : getVisible()
controller -> MapFragment : showPins()

```