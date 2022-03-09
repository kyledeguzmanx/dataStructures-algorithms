class MyCircularQueue {
    
    private int[] data;
    private int head;
    private int tail;

    public MyCircularQueue(int k) {
        data = new int[k];
        for(int i=0; i < k; i++){
            data[i] = -1;
        }
        head = 0;
        tail = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        else{
            data[tail] = value;
            if(tail+1 != data.length){
                tail++;
            }
            else{
                tail = 0;
            }
            return true;
        }
    }
    
    public boolean deQueue() {
    
    	if(data[head] == -1){
        	return false;
        }
        
        data[head] = -1;
        if(head+1 == data.length){
        	head = 0;
        }
        else{
        	head++;
        }
        return true;
    }
    
    public int Front() {
        return data[head];
    }
    
    public int Rear() {
        if(tail==0){
        	return data[data.length-1];
        }
        else{
        	return data[tail-1];
        }
    }
    
    public boolean isEmpty() {
        boolean status = true;  
        
        for(int i=0; i<data.length; i++){
            if(data[i] != -1){
                status = false;
            }
        }
        return status;
    }
    
    public boolean isFull() {
        boolean status = true;  
        
        for(int i=0; i<data.length; i++){
            if(data[i] == -1){
                status = false;
            }
        }
        return status;
    }
}
