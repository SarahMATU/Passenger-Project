//Name: Sarah Mitchell
//No: G00391704
//Description: Passenger Project CI/CD
package ie.atu;

public class Passenger {

        private String userTitle;
        private String userName;
        private String userId;
        private String numPhone;
        private int numAge;

        public Passenger(){ //Default Constructor

        }

        public String setUserTitle(String title) { //Sets the Users Title
                if(title.equals("Mr")||title.equals("Mrs")||title.equals("Ms")) {
                        userTitle = title;
                }
                else {
                        throw new IllegalArgumentException("This is not a valid Title");
                }

                return userTitle;
        }

        public String setUserName(String name) { //Sets the Users Name
                if(name.length() > 3 ) {
                        userName = name;
                }

                else { //If the name is shorter than 3 Characters, the program throws an error.
                        throw new IllegalArgumentException("This is not a valid Name");
                }
                return userName;
        }

        public String setUserId(String id) { //Sets the Users ID Number
                if(id.length() > 10 ) {
                        userId = id;
                }

                else { //If the ID is shorter than 10 Characters, the program throws an error.
                        throw new IllegalArgumentException("This is not a valid ID");
                }
                return userId;
        }

        public String setNumPhone(String phone) { //Sets the Users Phone Number
                if(phone.length() > 7) {
                        numPhone = phone;
                }

                else { //If the Phone Number is shorter than 7 Characters, the program throws an error.
                        throw new IllegalArgumentException("This is not a valid Phone Number");
                }
                return numPhone;
        }

        public int setNumAge(int age) { //Sets the Users Age
                if(age > 16) {
                        numAge = age;
                }

                else { //If the Users age is less than 16, the program throws an error.
                        throw new IllegalArgumentException("This is not a valid Phone Number");
                }
                return numAge;
        }
}
