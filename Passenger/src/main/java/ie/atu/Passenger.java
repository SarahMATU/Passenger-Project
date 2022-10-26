package ie.atu;

public class Passenger {

        private String userTitle;
        private String userName;
        private String userId;
        private String numPhone;
        private int numAge;


        public Passenger(){

        }

        public String setUserTitle(String title) {
                if(title.equals("Mr")||title.equals("Mrs")||title.equals("Ms"))
                {
                        userTitle = title;
                }
                else
                {
                        throw new IllegalArgumentException("This is not a valid Title");
                }

                return userTitle;
        }

        public String setUserName(String name)
        {
                if(name.length() > 3 )
                {
                        userName = name;
                }

                else
                {
                        throw new IllegalArgumentException("This is not a valid Name");
                }
                return userName;
        }

        public String setUserId(String id)
        {
                if(id.length() > 10 )
                {
                        userId = id;
                }

                else
                {
                        throw new IllegalArgumentException("This is not a valid ID");
                }
                return userId;
        }

        public String setNumPhone(String phone)
        {
                if(phone.length() > 7
                )
                {
                        numPhone = phone;
                }

                else
                {
                        throw new IllegalArgumentException("This is not a valid Phone Number");
                }
                return numPhone;
        }
}
