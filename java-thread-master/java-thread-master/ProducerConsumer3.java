import java.util.concurrent.ArrayBlockingQueue;

/**
 * n producers and n consumers share
 * a thread-safe ArrayBlockingQueue
 */

public class ProducerConsumer3{
  private static int NUM_MESSAGES = 3;
  private static int NUM_PRODUCERS = 15;
  private static int NUM_CONSUMERS = 15;
  // NUM_MESSAGES must equal NUM_CONSUMERS so that the buffer
  // should be empty in the end

  public static void main(String[] args) throws InterruptedException{
    // create a buffer and share it among all producers and consumers
    ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(10);

    // create and start the producer threads
    Thread[] producers = new Thread[NUM_PRODUCERS];
    for(int i=0; i<NUM_PRODUCERS; i++){
      producers[i] = new Producer("producer"+i, buffer);
      producers[i].start();
    }

    // create and start the consumer threads
    Thread[] consumers = new Thread[NUM_CONSUMERS];
    for(int i=0; i<NUM_CONSUMERS; i++){
      consumers[i] = new Consumer("consumer"+i, buffer);
      consumers[i].start();
    }

    // make this main thread to wait for the producer
    // threads to finish (join the main thread)
    for(int i=0; i<NUM_PRODUCERS; i++){
      producers[i].join();
    }

    // make this main thread to wait for the consumer
    // threads to finish (join the main thread)
    for(int i=0; i<NUM_CONSUMERS; i++){
      consumers[i].join();
    }

    // print what's left in buffer
    System.err.println("messages left in buffer:");
    System.err.println(buffer);
  }

  public static class Producer extends Thread{
    ArrayBlockingQueue<String> buffer;

    public Producer(String name, ArrayBlockingQueue<String> newBuffer){
      super(name);
      buffer = newBuffer;
    }

    public void run(){
      // each thread attempts to create NUM_MESSAGES messages
      // and put them in the shared buffer (queue)
      for (int i=0; i<NUM_MESSAGES; i++){
        try{
          String message = "message "+i+" from thread "+getName();
          buffer.put(message);
          System.err.println("sent "+message);
        }catch(InterruptedException e){}
      }
    }
  }

  public static class Consumer extends Thread{
    ArrayBlockingQueue<String> buffer;

    public Consumer(String name, ArrayBlockingQueue<String> newBuffer){
      super(name);
      buffer = newBuffer;
    }

    public void run(){
      int count = 0;
      // each consumer thread attempts to retrieve NUM_MESSAGES
      // messages from the shared buffer (queue)
      while (count < NUM_MESSAGES){
        try{
          String message;
          message = buffer.take();
          System.err.println(getName()+" received "+message);
          count++;
        }catch(InterruptedException e){}
      }
    }
  }
}
