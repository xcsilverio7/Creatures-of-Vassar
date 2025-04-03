## Test Report

### Transcript



System: What would you like to do?:

User: add pin

System: Enter Latitude

User: 41.657

System: Enter Longitude

User: -72

System: Latitude not in vassar, try again

Enter Longitude

User: -73.907

System: Enter name

What would you like to do?:

User: add pin

System: Enter Latitude

User: 41.657

System: Enter Longitude

User: -73.907

System: Enter name

User: Barry

What would you like to do?:

User: display map

System: 

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491



Author:

Likes: 0

ID: none

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: none


System: Would you like to like/unlike a pin, add ID, or go back?

User: like pin

System: Select pin to like: 1 - 2

User: 1

System: Pin successfully liked

System: What would you like to do?:

User: display map

System: 

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491

Author:

Likes: 1

ID: none



Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: none


System: Would you like to like/unlike a pin, add ID, or go back?

User: like pin

System: Select pin to like: 1 - 2

User: 1

System: Pin successfully unliked

System: What would you like to do?:

User: display map

System: 

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491

Author:

Likes: 0

ID: none



Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: none


System: Would you like to like/unlike a pin, add ID, or go back?

User: add ID

System: Select pin to ID: 1 - 2

User: 2

System: Enter ID:

User: Beaver

System: 

ID successfully added

What would you like to do?:

User: display map

System: 

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491

Author:

Likes: 0

ID: none



Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: Beaver (logged 1 times)


System: Would you like to like/unlike a pin, add ID, or go back?

User: add id

System: What would you like to do?:

User: display map

System:

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491

Author:

Likes: 0

ID: none



Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: Beaver (logged 1 times)


System: Would you like to like/unlike a pin, add ID, or go back?

User: add ID

System: Select pin to ID: 1 - 2

User: 1

System: Enter ID:

User: Beaver

System: ID successfully added

System: What would you like to do?:

User: display map

System:

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491

Author:

Likes: 0

ID: Beaver (logged 2 times)



Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: Beaver (logged 2 times)


System: Would you like to like/unlike a pin, add ID, or go back?

User: back

System: What would you like to do?:

User: add pin

System: Enter Latitude

User: 42

System: Latitude not in vassar, try again

System: Enter Latitude

User: 41.658

System: Enter Longitude

User: -73.900

System: Enter name

User: James

System: What would you like to do?:

User: display map

System:

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491

Author:

Likes: 0

ID: Beaver (logged 2 times)



Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: Beaver (logged 2 times)



Coords: [41.658, -73.9]

Time: 2024-10-29T10:30:05.645636943

Author: James

Likes: 0

ID: none


Would you like to like/unlike a pin, add ID, or go back?

User: add ID

System: Select pin to ID: 1 - 3

User: 3

System: Enter ID:

User: deer

System: ID successfully added

System: What would you like to do?:

User: display map

Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:13.615106491

Author:

Likes: 0

ID: Beaver (logged 2 times)



Coords: [41.657, -73.907]

Time: 2024-10-29T10:26:42.480079301

Author: Barry

Likes: 0

ID: Beaver (logged 2 times)



Coords: [41.658, -73.9]

Time: 2024-10-29T10:30:05.645636943

Author: James

Likes: 0

ID: deer (logged 1 times)


System: Would you like to like/unlike a pin, add ID, or go back?

User: add ID

System: Select pin to ID: 1 - 3

User: 3

System: Enter ID:

User: blue jay

System: Pin already has ID

System: What would you like to do?:

User: quit

System: Process finished with exit code 0


## Summary 
We expected our app to add a pin on a location at Vassar, display all the pins on the "map", add an animal ID, and like and unlike a pin. 
All of these expectations were met, but there are many improvements that we can make to our prototype. Liking has not 
been fully tested, for we need to increment the number of likes for multiple users. The prototype unsurprisingly only supports
one user. The user should be able to log names for the same thing under the same species. Right now, the program is case sensitive, 
so "cat" and "Cat" are two different species. Ideally, in the final program, adding an ID would also offer an autofill
if the species is similar to one already in the database.