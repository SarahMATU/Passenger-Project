//Name: Sarah Mitchell
//No: G00391704
//Description: Passenger Project CI/CD
package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Passenger {

        private String userTitle;
        private String userName;
        private String userId;
        private String numPhone;
        private int numAge;

        public Passenger(String title, String name, String id, String phone, int age) { //Default Constructor
                setUserTitle(title);
                setUserName(name);
                setUserId(id);
                setNumPhone(phone);
                setNumAge(age);
        }

        public void setUserTitle(String title) { //Sets the Users Title
                if(title.equals("Mr")||title.equals("Mrs")||title.equals("Ms")) {
                        userTitle = title;
                }
                else {
                        throw new IllegalArgumentException("This is not a valid Title");
                }
        }

        public String getUserTitle() {
                return userTitle;
        }

        public void setUserName(String name) { //Sets the Users Name
                if(name.length() > 3 ) {
                        userName = name;
                }

                else { //If the name is shorter than 3 Characters, the program throws an error.
                        throw new IllegalArgumentException("This is not a valid Name");
                }
        }

        public String getUserName() {
                return userName;
        }

        public void setUserId(String id) { //Sets the Users ID Number
                if(id.length() > 10 ) {
                        userId = id;
                }

                else { //If the ID is shorter than 10 Characters, the program throws an error.
                        throw new IllegalArgumentException("This is not a valid ID");
                }
        }

        public String getUserId() {
                return userId;
        }

        public void setNumPhone(String phone) { //Sets the Users Phone Number
                if(phone.length() > 7) {
                        numPhone = phone;
                }

                else { //If the Phone Number is shorter than 7 Characters, the program throws an error.
                        throw new IllegalArgumentException("This is not a valid Phone Number");
                }
        }

        public String getNumPhone() {
                return numPhone;
        }

        public void setNumAge(int age) { //Sets the Users Age
                if(age > 16) {
                        numAge = age;
                }

                else { //If the Users age is less than 16, the program throws an error.
                        throw new IllegalArgumentException("User must be over 16");
                }
        }
        public int getNumAge() {
                return numAge;
        }
}