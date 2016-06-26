/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author Himel
 */
import java.io.*;
import java.net.*;

public class Server {

    public static void main(String argv[]) throws Exception {
        int workerThreadCount = 0;
        int id = 1;
        ServerSocket welcomeSocket = new ServerSocket(7789);
        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            WorkerThread wt = new WorkerThread(connectionSocket, id);
            Thread t = new Thread(wt);
            t.start();
            workerThreadCount++;
            System.out.println("Client [" + id + "] is now connected. No. of worker threads = " + workerThreadCount);
            id++;
        }

    }
}

class WorkerThread implements Runnable {

    private Socket connectionSocket;
    private int id;

    public WorkerThread(Socket ConnectionSocket, int id) {
        this.connectionSocket = ConnectionSocket;
        this.id = id;
    }

    public void run() {
        String clientSentence;
        String capitalizedSentence;
        while (true) {
            try {
                ObjectOutputStream outToServer = new ObjectOutputStream(connectionSocket.getOutputStream());
                ObjectInputStream inFromServer = new ObjectInputStream(connectionSocket.getInputStream());
                Object clientObj = inFromServer.readObject();

                // FileInputStream fin= new FileInputStream("player1.txt");
                if (id == 1) {
                    FileOutputStream fout1 = new FileOutputStream("player1.txt");
                    ObjectOutputStream outTFile = new ObjectOutputStream(fout1);
                    outTFile.writeObject(clientObj);
                    outTFile.flush();
                    System.out.println("id 1");
                }
                if (id == 2) {
                    FileOutputStream fout2 = new FileOutputStream("player2.txt");
                    ObjectOutputStream outTFile = new ObjectOutputStream(fout2);
                    outTFile.writeObject(clientObj);
                    outTFile.flush();
                    System.out.println("id 2");
                }
                /*BufferedReader buf=new BufferedReader(new InputStreamReader(fin));
                capitalizedSentence = buf.readLine();
                outToServer.writeBytes(capitalizedSentence + '\n');*/

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("server.WorkerThread.run()");
                break;
            }
        }
    }
}
