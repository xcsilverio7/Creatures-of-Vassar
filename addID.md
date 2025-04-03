# Add ID

### Primary Actors and Goals

__Student__: Wants to identify an animal see in someone else's photo.
__Firestore Database__: Stores collections of data.  

### Preconditions
* The student has opened the app
* The student is looking at the map screen
* The app has connected to Google Maps
* The student has clicked a pin and viewed the photo attached
* They have selected the add ID button

### Post-conditions
* The ID has been uploaded to the server and linked to the pin
* The app has returned to the map screen

### Workflow



```plantuml
@startuml
'define swimlanes
|#technology|Student|
|#implementation|System|



start
|System|
if (ID?) then (yes)
    :Display ID;
    stop 
else (no) 
   |Student|
   if(Add ID?) then (yes)
   else (no)
   stop 
endif
   |System|
   :Display text entry box;
   |Student|
   if (Type out ID) then (Cancel)
        stop
   else
   |System|
   :Autofill;
   |Student|
   if (Accept autofill?) then (No)
   :Write fully new ID;
   else (Yes)
   endif
   :Upload ID;
   if (Type of animal IDed before?) then (Yes)
   :Increment count on database;
   stop
   else (No)
   :Add entry for species on database;
   stop
   end if

@enduml

```

### Sequence Diagram


```plantuml
@startuml 
actor Student as student
participant " : UI" as ui
participant " : Controller" as controller
participant " : userIDs : IDs[]" as IDS
participant ": ID" as ID
actor Firestore as db


ui -> student : Display Map
student -> ui: Tap a pin
student -> ui: Create and add an ID
ui -> controller : addID() 
controller -> db : db.collection("pins")
controller -> db : update ID on database
controller -> IDS : checkRepeatID()
controller -> species : checkSpecies(ID)
controller -> IDS : userIDS.add(ID)
controller -> ID : incrementIDS()
```