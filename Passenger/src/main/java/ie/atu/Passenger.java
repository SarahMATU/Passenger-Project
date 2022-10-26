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

}
