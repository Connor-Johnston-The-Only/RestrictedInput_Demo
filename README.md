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
				RestrictedInput.intInputOnly(false, e);
			}
		});
    
Would only allow user to input integers; no spaces
Change the false to true... and th euser can input integers and spaces
