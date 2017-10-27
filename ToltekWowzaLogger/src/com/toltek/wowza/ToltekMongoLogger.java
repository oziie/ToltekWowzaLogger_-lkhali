package com.toltek.wowza;

import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;
import com.wowza.wms.mediacaster.IMediaCaster;
import com.wowza.wms.stream.IMediaStream;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

import org.bson.Document;  
import com.mongodb.MongoClient; 


public class ToltekMongoLogger 
{  
	
	
	
			
	public static void LogaEkle(ToltekObject log) throws InvocationTargetException
    {
		  
	      System.out.println("DATABASE BAÐLANDI!!!"); 
	      MongoClient mClient=new MongoClient( "localhost" , 27017 );
	      MongoDatabase database = mClient.getDatabase("Ogrenciler"); 
	      MongoCollection<Document> collection = database.getCollection("Ogrenciler"); 
	      Document document = new Document("title", "Wowza")
		      .append("id", 2)
		      .append("AppVersion", "0.1") 
		      .append("AppName",log.getAppName());
		     // .append("StreamName",log.getStreamName());
		     
		      collection.insertOne(document); 

} 
     
	
   
	
   
    
   } 
