
package Iterator;

/**
 *
 * @author alunodib
 */
public class NameRepository implements Iterator {
    public String names[] = {"Robert" , "John" ,"Julie", "Lora"};

    public Iterator getIterator() {
        return new NameIterator(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    private class NameIterator implements Iterator {
        
        int index;

        @Override
        public boolean hasNext() {
            
            if (index < names.length){
                return true;
            }
           return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
           
    }
}
