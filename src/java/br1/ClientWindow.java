package src.java;

public class AddTwoNumbers {
	
	private final Thread rxThreadd;
    private final TCPConnectionListener eventListener;
    private final BufferedReader in;
<<<<<<< HEAD
=======
	
	private int abr;
>>>>>>> 898e868d3bd072faa5dd62426c6797849f394043

   public TCPConnection(final TCPConnectionListener eventListener, Socket socket) throws IOException {
        this.eventListener = eventListener;
		this.socket = socket; 
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
        rxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    eventListener.onConnectionReady(TCPConnection.this);
                    while (!rxThread.isInterrupted()) {
                        eventListener.onReceiveString(TCPConnection.this, in.readLine());
                    }
                } catch (IOException e) {
                    eventListener.onException(TCPConnection.this, e);
                } finally {
                    eventListener.onDisconnect(TCPConnection.this);
                }
            }
        });
        rxThread.start();
    }
	
	public static void main(String[] args) {
      
      int num1 = 5, num2 = 15;
	  int del;

      del = num1 / num2;
	  
      logger.log("Sum of these numbers: " + del);
   }
	
}