package app;


public class CustomCollectionServiceImpl implements CustomCollectionService {


    private final String[] strArray;

    private int count;

    public CustomCollectionServiceImpl(int value) {
        this.strArray = new String[value];
        this.count = 0;
    }

    @Override
        public boolean delete (String value){
            for (int i = 0; i < count; i++) {
                if (strArray[i] != null && strArray[i].equals(value)) {
                    return delete(i);
                }
            }
            return false;
        }

        @Override
        public String get ( int index){
            if (index < 0 || index >= count) {
                return null;
            }
            return strArray[index];
        }

        @Override
        public boolean add ( int index, String value){
            if (index < 0 || index > count || count == strArray.length) {
                return false;
            }

            for (int i = count; i > index; i--) {
                strArray[i] = strArray[i - 1];
            }

            strArray[index] = value;
            count++;
            return true;
        }

        @Override
        public boolean add (String value){
            return add(count, value);
        }

        @Override
        public boolean delete ( int index){
            if (index < 0 || index >= count) {
                return false;
            }

            for (int i = index; i < count - 1; i++) {
                strArray[i] = strArray[i + 1];
            }

            strArray[count - 1] = null;
            count--;
            return true;
        }

        @Override
        public boolean contain(String o) {
            for (int i = 0; i < count; i++) {
            if (strArray[i].equals(o)) {
                return true;
             }
          }
           return false;
      }

        @Override
        public boolean clear() {
              count = 0;
           return true;
       }

        @Override
        public int size() {
          return count;
      }

        @Override
        public boolean equals(CustomCollectionService str) {
            if (this == str) {
                return true;
            }
            if (str == null || getClass() != str.getClass()) {
                return false;
            }
            CustomCollectionServiceImpl other = (CustomCollectionServiceImpl) str;
            return count == other.count;
        }

        @Override
        public void printCollection () {
            for (int i = 0; i < count; i++) {
                System.out.println(strArray[i] + " ");
            }
            System.out.println(" ");
        }
    }







