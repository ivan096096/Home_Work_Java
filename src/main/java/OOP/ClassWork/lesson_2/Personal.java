package OOP.ClassWork.lesson_2;


import java.util.Iterator;
import java.util.List;


public class Personal implements Iterable<User> {
    private List<User> users;


    @Override
    public Iterator<User> iterator() {
        return new UsedrsIterator();
//            private int correntIndex = 0;
//
//            @Override
//            public boolean hasNext() {
//                return (users.size() > correntIndex);
//            }
//
//            @Override
//            public User next() {
//                return users.get(correntIndex++);
//            }

    }


    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);

    }
    private class UsedrsIterator implements Iterator<User>{
        private int correntIndex = 0;

        @Override
        public boolean hasNext() {
            return (users.size() > correntIndex);
        }

        @Override
        public User next() {
            return users.get(correntIndex++);
        }
    }

}
