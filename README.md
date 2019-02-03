###Views
Views are UI elements such as TextBox, EditText, Button etc
Parent Views / View groups are containers for Views (e.g. Linear Layout, Relative Layout)
View id is defined in the XML file
View elements are access in Java using findViewById(R.id.<view_id>)

How to interact with Views in Java:
* Declare Java objects (such as "Button myButton") inside the main class
* In the onCreate method, find the view using findViewById(R.id.<view_id>) and assign to the sJava object (cast required)


### Activity
Activity is a single UI screen.
An activity needs to be started by an Intent which contains the payload to the new activity.
The activity's onCreate method invoked when the activity is started.


### Intents
Intents are used to message between two components (e.g. From one activity to start another activity)

To start a new activity
* In a action method such as onClick of a button, create an Intent
  * Intent i = new Intent(this, <destination>)
* For the <destination>, refer to the class of the second activity: SecondActivity.class
* In the SecondActivity's onCreate method:
  * setContentView(R.layout.<second_activity>) -- Referring to the second xml file
  * Get the intent data by using getDataString
