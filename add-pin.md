# Add Pin

### Primary Actors and Goals

__Student__: Wants to add a pin to the map, showing off the location 
and a photo of an animal they spotted on campus.

__Firestore Database__: Stores collections of data. 

### Preconditions
* The student has opened the app
* The student is looking at the map screen
* The app has connected to Google Maps
* The student has long tapped to create a pin

### Post-conditions
* The pin location and photo have been uploaded 
* The app has returned to the map screen

### Workflow

```plantuml
'define swimlanes
|#technology|Student|
|#implementation|System|

|System|
start
if (Is location within Vassar?) then (No(Cancel))
    stop
else (Yes)
endif
|Student|
:Enter Name;
:Enter Id (optional);
|System|
:Save location;
:Execute __Upload Photo__;
:Upload data to database;
:Save timestamp;
:Return to map screen;
stop



```

### Sequence Diagram

```plantuml
@startuml
actor Student as student
actor FirestoneDatabase as db
participant " : MapFragment" as mf
participant " : ControllerActivity" as controller
participant " PinDatabase : Pin[]" as pins
participant " new-pin : Pin" as pin





mf -> student : OnMapReadyCallback()
student -> mf: Tap to create pin 
db -> pins : get pins
mf -> student: Prompt for additional info (photo)
student -> mf: Send photo
mf -> controller : addPin(Marker m, IMapView view)
controller -> pin ** : new-pin = Pin(Marker m, LocalDateTime t, String a)  
controller -> pins : add new-pin to
 






```