// Fig. 8.37: AddressBookEntryFrame.java
// A subclass of JInternalFrame customized to display and 
// an AddressBookEntry or set an AddressBookEntry's properties
// based on the current data in the UI.
//package com.deitel.advjhtp1.jdbc.addressbook;

// Java core packages
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

// Java extension packages

public class AddressBookEntryFrame extends JInternalFrame {
   
   // HashMap to store JTextField references for quick access
   private HashMap fields; 
   
   // current AddressBookEntry set by AddressBook application
   private AddressBookEntry person;
   
   // panels to organize GUI
   private JPanel leftPanel, rightPanel, newPanel;
   
   // static integers used to determine new window positions  
   // for cascading windows
   private static int xOffset = 0, yOffset = 0;
   
   // static Strings that represent name of each text field.
   // These are placed on JLabels and used as keys in 
   // HashMap fields.
   private static final String FIRST_NAME = "First Name", 
      LAST_NAME = "Last Name", ADDRESS1 = "Primary Address1",
      ADDRESS2 = "Primary Address2", CITYORTOWN = "Primary City/Town",
      COUNTY = "Primary County", PHONE = "Primary Phone No.", EMAIL = "Primary Email",
      ADDRESS1_SEC = "Secondary Address1", ADDRESS2_SEC = "Secondary Address2",
      CITYORTOWN_SEC = "Secondary City/Town", COUNTY_SEC = "Secondary County",
      PHONE_SEC = "Secondary Phone No.", EMAIL_SEC = "Secondary Email",
      SEC_INFO1 = "Secondary Info", SEC_INFO2 = "Optional";
  
   // construct GUI
   public AddressBookEntryFrame()
   {
      super( "Address Book Entry", true, true );

      JLabel secondary = new JLabel( "", SwingConstants.LEFT);
      JLabel secondary2 = new JLabel( "================= Secondary Address Optional =================");
      //JButton addSecondary = new JButton("Add Secondary Address");
      fields = new HashMap();  

      leftPanel = new JPanel();
      leftPanel.setLayout( new GridLayout( 15, 2, 0, 5 ) );
      rightPanel = new JPanel();
      rightPanel.setLayout( new GridLayout( 15, 2, 0, 5 ) );
      newPanel = new JPanel();
      newPanel.setLayout( new GridLayout( 15, 2, 0, 5 ) );


      createRow( FIRST_NAME );//row 1
      createRow( LAST_NAME );//row 2
      createRow( ADDRESS1 );//row 3
      createRow( ADDRESS2 );//row4
      createRow( CITYORTOWN );//row 5
      createRow( COUNTY );//row 6
      createRow( PHONE );//row 7
      createRow( EMAIL );//row 8
      //row9 for label
      leftPanel.add(secondary);
      rightPanel.add(secondary2);
      createRow( ADDRESS1_SEC );//row10
      createRow( ADDRESS2_SEC );//row11
      createRow( CITYORTOWN_SEC );//row12
      createRow( COUNTY_SEC );//row13
      createRow( PHONE_SEC );//row14
      createRow( EMAIL_SEC );//row15
      //leftPanel2.add(secondary);

      //rightPanel2
      //centerPanel.add( addSecondary );
      
      Container container = getContentPane();
      container.add( leftPanel, BorderLayout.WEST );
      container.add( rightPanel, BorderLayout.CENTER );
      //container.add( newPanel, BorderLayout.CENTER );

     
      setBounds(xOffset, yOffset, 600, 400);
      xOffset = ( xOffset + 30 ) % 300;
      yOffset = ( yOffset + 30 ) % 300;
   }

   // set AddressBookEntry then use its properties to 
   // place data in each JTextField
   public void setAddressBookEntry( AddressBookEntry entry )
   {
      person = entry;
      
      setField( FIRST_NAME, person.getFirstName() );
      setField( LAST_NAME, person.getLastName() );
      setField( ADDRESS1, person.getAddress1() );
      setField( ADDRESS2, person.getAddress2() );
      setField( CITYORTOWN, person.getCityOrTown() );
      setField( COUNTY, person.getCounty() );
      setField( PHONE, person.getPhoneNumber() );
      setField( EMAIL, person.getEmailAddress() );

      //Secondary Address
      setField( ADDRESS1_SEC, person.getAddress1_sec() );
      setField( ADDRESS2_SEC, person.getAddress2_sec() );
      setField( CITYORTOWN_SEC, person.getCityOrTown_sec() );
      setField( COUNTY_SEC, person.getCounty_sec() );
      setField( PHONE_SEC, person.getPhoneNumber_sec() );
      setField( EMAIL_SEC, person.getEmailAddress_sec() );
   }
   
   // store AddressBookEntry data from GUI and return 
   // AddressBookEntry
   public AddressBookEntry getAddressBookEntry()
   {
      person.setFirstName( getField( FIRST_NAME ) );
      person.setLastName( getField( LAST_NAME ) );
      person.setAddress1( getField( ADDRESS1 ) );
      person.setAddress2( getField( ADDRESS2 ) );
      person.setCityOrTown(getField( CITYORTOWN ) );
      person.setCounty(getField( COUNTY ));
      person.setPhoneNumber( getField( PHONE ) );
      person.setEmailAddress( getField( EMAIL ) );

      //Secondary Stuff
      person.setAddress1_sec( getField( ADDRESS1_SEC ) );
      person.setAddress2_sec(getField(ADDRESS2_SEC) );
      person.setCityOrTown_sec( getField( CITYORTOWN_SEC ) );
      person.setCounty_sec( getField( COUNTY_SEC ) );
      person.setPhoneNumber_sec(getField( PHONE_SEC ) );
      person.setEmailAddress_sec( getField( EMAIL_SEC ) );

      return person;
   }

   // set text in JTextField by specifying field's
   // name and value
   private void setField( String fieldName, String value )
   {
      JTextField field = 
         ( JTextField ) fields.get( fieldName );
      
      field.setText( value );
   }
   
   // get text in JTextField by specifying field's name
   private String getField( String fieldName )
   {
      JTextField field = 
         ( JTextField ) fields.get( fieldName );
            
      return field.getText();  
   }
   
   // utility method used by constructor to create one row in
   // GUI containing JLabel and JTextField
   private void createRow( String name )
   {
      JLabel label = new JLabel( name, SwingConstants.RIGHT );

      label.setBorder(
         BorderFactory.createEmptyBorder( 5, 5, 5, 5 ) );
      leftPanel.add( label );

      JTextField field = new JTextField( 30 );
      JTextField newfield = new JTextField( 30 );
      rightPanel.add( field );
      newPanel.add( newfield );

      fields.put( name, field );

   }



}  // end class AddressBookEntryFrame


/**************************************************************************
 * (C) Copyright 2001 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
