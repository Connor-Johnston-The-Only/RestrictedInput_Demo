# RestrictedInput_Demo
A class demo to restrict user input

Recently learned how to make classes and I was making a GUI and I wanted to limit user input to numbers and kinda got carried away.
Adding more later

Still not sure if I should add / keep 'doubleInputOnly'
Please add to this if you know a better way of doing 'doubleInputOnly'.
I'll also take suggestions on what to add or take away.

Example:

    RestrictedInput reInput = new RestrictedInput();
    //RestrictedInput [object_Name] = new RestrictedInput();
    
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				reInput.intInputOnly(false, e);'
				
				//[object_Name].intInputOnly([Bool*], e);
				//	or
				//RestrictedInput.intInputOnly([Bool*], e);
			}
		});
    
Would only allow user to input integers; no spaces
Change the false to true... and the user can input integers and spaces


*Bool	- Boolean *
^ Everyone knows that but you know "short, memorable, and easy to read at anytime by anyone" or whatever ^
