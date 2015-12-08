// Fig. 8.33: AddressBookEntry.java
// JavaBean to represent one address book entry.
//package com.deitel.advjhtp1.jdbc.addressbook;

public class AddressBookEntry {
   private String firstName = "";
   private String lastName = "";
   private String address1 = "";
   private String address2 = "";
   private String city_or_town = "";
   private String county = "";
   private String phoneNumber = "";
   private String emailAddress = "";
   private String address1_sec = "";
   private String address2_sec = "";
   private String city_or_town_sec = "";
   private String county_sec = "";
   private String phoneNumber_sec = "";
   private String emailAddress_sec = "";
   private int personID;
   private int addressID;
   private int phoneID;
   private int emailID;
   private String adb_ID = "";
   
   // empty constructor
   public AddressBookEntry()
   {
   }

   // set person's id
   public AddressBookEntry( int id )
   {
      personID = id;
   }
   
   // set person's first name
   public void setFirstName( String first )
   {
      firstName = first;
   }
   
   // get person's first name
   public String getFirstName()
   {
      return firstName;
   }
   
   // set person's last name
   public void setLastName( String last )
   {
      lastName = last;
   }
   
   // get person's last name
   public String getLastName()
   {
      return lastName;
   }
   
   // set first line of person's address
   public void setAddress1( String firstLine )
   {
      address1 = firstLine;
   }
   
   // get first line of person's address
   public String getAddress1()
   {
      return address1;
   }
   
   // set second line of person's address
   public void setAddress2( String secondLine )
   {
      address2 = secondLine;
   }
   
   // get second line of person's address
   public String getAddress2()
   {
      return address2;
   }
   
   // set city in which person lives
   public void setCityOrTown( String personCityOrTown )
   {
      city_or_town = personCityOrTown;
   }
   
   // get city in which person lives
   public String getCityOrTown()
   {
      return city_or_town;
   }
   
   // set state in which person lives
   public void setCounty( String personCounty )
   {
      county = personCounty;
   }
   
   // get state in which person lives
   public String getCounty()
   {
      return county;
   }

   // set person's phone number
   public void setPhoneNumber( String number )
   {
      phoneNumber = number;
   }
   
   // get person's phone number 
   public String getPhoneNumber()
   {
      return phoneNumber;
   }

   // set person's email address
   public void setEmailAddress( String email )
   {
      emailAddress = email;
   }
   
   // get person's email address
   public String getEmailAddress()
   {
      return emailAddress;
   }

   // get person's ID
   public int getPersonID()
   {
      return personID;
   }
   
   // set person's addressID
   public void setAddressID( int id )
   {
      addressID = id;
   }
   
   // get person's addressID
   public int getAddressID()
   {
      return addressID;
   }
   
   // set person's phoneID
   public void setPhoneID( int id )
   {
      phoneID = id;
   }
   
   // get person's phoneID
   public int getPhoneID()
   {
      return phoneID;
   }
   
   // set person's emailID
   public void setEmailID( int id )
   {
      emailID = id;
   }
   
   // get person's emailID
   public int getEmailID()
   {
      return emailID;
   }

   // Set all of persons secondary address
// set first line of person's secondary address
   public void setAddress1_sec( String firstLine )
   {
      address1_sec = firstLine;
   }

   // get first line of person's secondary address
   public String getAddress1_sec()
   {
      return address1_sec;
   }

   // set second line of person's secondary address
   public void setAddress2_sec( String secondLine )
   {
      address2_sec = secondLine;
   }

   // get second line of person's secondary address
   public String getAddress2_sec()
   {
      return address2_sec;
   }

   // set city in which person lives
   public void setCityOrTown_sec( String personCityOrTown )
   {
      city_or_town_sec = personCityOrTown;
   }

   // get city in which person lives
   public String getCityOrTown_sec()
   {
      return city_or_town_sec;
   }

   // set state in which person lives
   public void setCounty_sec( String personCounty )
   {
      county_sec = personCounty;
   }

   // get state in which person lives
   public String getCounty_sec()
   {
      return county_sec;
   }

   // set person's phone number
   public void setPhoneNumber_sec( String number )
   {
      phoneNumber_sec = number;
   }

   // get person's phone number
   public String getPhoneNumber_sec()
   {
      return phoneNumber_sec;
   }

   // set person's email address
   public void setEmailAddress_sec( String email )
   {
      emailAddress_sec = email;
   }

   // get person's email address
   public String getEmailAddress_sec()
   {
      return emailAddress_sec;
   }

}  // end class AddressBookEntry


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
