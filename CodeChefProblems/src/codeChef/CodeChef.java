package src.codeChef;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;


class CodeChef {

	public static void main(String[] args) throws NumberFormatException, IOException {
		CodeChef read = new CodeChef();
		System.out.println("Enter the number of testcases");
		int testCases = read.nextInt();
		while(testCases-- > 0){
			System.out.println("Enter the length of track");
			int lenghtofTrack = read.nextInt();
			int arr[]=new int[lenghtofTrack];
			System.out.println("Enter the maximum lenght at best speed");
			int speed = read.nextInt();
			for(int i =0;i<arr.length;i++){
				System.out.println("Enter values in each kms");
				arr[i] = read.nextInt();
			}
			System.out.println("Maximum value is:"+read.greatRun(arr, speed));
		}
	}
	
	public int findSubArray(int[] arr){
		int size = arr.length;
		if(size > 1 && arr[0] > arr[size-1]){
			return size;
		}else{
			if(size>1){
			for(int i =0;i<size;i++){
				int[] subArr = Arrays.copyOfRange(arr, i, size-1);
				int[] subArr1 = Arrays.copyOfRange(arr, i+1, size);
				findSubArray(subArr);
				findSubArray(subArr1);
			}
			}
		}
		return size;
    }
    
    public boolean isGoodSubArray(int[] arr){
		boolean retVal = Boolean.FALSE;
		int size = arr.length;
		if(arr[0] > arr[size-1]){
			retVal = Boolean.TRUE;
		}
		return retVal;
	}
    
    
    //GreatRun
    public int greatRun(int[] arr, int k){
    	int retVal = 0;
    	for(int i=0;i<arr.length;i++){
    		int subarr[] = Arrays.copyOfRange(arr, i, i+k);
    		int sum =0;
    		for(int j=0;j<subarr.length;j++){
    			sum+= subarr[j];
    		}
    		if(sum > retVal){
    			retVal = sum;
    		}
    	}
    	return retVal;
    }
    
    
    
    
    
    
    		final private int BUFFER_SIZE = 1 << 16;
            private DataInputStream din;
            private byte[] buffer;
            private int bufferPointer, bytesRead;
     
            public CodeChef()
            {
                din = new DataInputStream(System.in);
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
     
            public CodeChef(String file_name) throws IOException
            {
                din = new DataInputStream(new FileInputStream(file_name));
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
     
            public String readLine() throws IOException
            {
                byte[] buf = new byte[64]; // line length
                int cnt = 0, c;
                while ((c = read()) != -1)
                {
                    if (c == '\n')
                        break;
                    buf[cnt++] = (byte) c;
                }
                return new String(buf, 0, cnt);
            }
     
            public int nextInt() throws IOException
            {
                int ret = 0;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                    c = read();
                do
                {
                    ret = ret * 10 + c - '0';
                }  while ((c = read()) >= '0' && c <= '9');
     
                if (neg)
                    return -ret;
                return ret;
            }
     
            public long nextLong() throws IOException
            {
                long ret = 0;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                    c = read();
                do {
                    ret = ret * 10 + c - '0';
                }
                while ((c = read()) >= '0' && c <= '9');
                if (neg)
                    return -ret;
                return ret;
            }
     
            public double nextDouble() throws IOException
            {
                double ret = 0, div = 1;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                    c = read();
     
                do {
                    ret = ret * 10 + c - '0';
                }
                while ((c = read()) >= '0' && c <= '9');
     
                if (c == '.')
                {
                    while ((c = read()) >= '0' && c <= '9')
                    {
                        ret += (c - '0') / (div *= 10);
                    }
                }
     
                if (neg)
                    return -ret;
                return ret;
            }
     
            private void fillBuffer() throws IOException
            {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1)
                    buffer[0] = -1;
            }
     
            private byte read() throws IOException
            {
                if (bufferPointer == bytesRead)
                    fillBuffer();
                return buffer[bufferPointer++];
            }
     
            public void close() throws IOException
            {
                if (din == null)
                    return;
                din.close();
            }
        
    

}
