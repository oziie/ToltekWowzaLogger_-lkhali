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
		
	      //Java üzerinde görebileceğimiz bir çıktı mesajı ayarlanıyor.
		
	      System.out.println("DATABASE BAÐLANDI!!!"); 
		
		//Yeni bir MongoClient nesnesi oluşturuyoruz.
		
		//Daha sonra Ogrenciler adındaki database üzerinden
		
		//collection ı getiriyoruz.
		
	      MongoClient mClient=new MongoClient( "localhost" , 27017 );
	      MongoDatabase database = mClient.getDatabase("Ogrenciler"); 
	      MongoCollection<Document> collection = database.getCollection("Ogrenciler"); 
		
		//Dokuman olusturuluyor ve yazılıyor.
		
	      Document document = new Document("title", "Wowza")
		      .append("id", 2)
		      .append("AppVersion", "0.1") 
		      
		      //log.getAppName() ToltekObject.java dosyasında tanımladığımız metodtur.
		      
		      .append("AppName",log.getAppName());
		  
		//istersek burada stream name için de aynı şeyi yapabilirdik.
		
		// .append("StreamName",log.getStreamName());
		     
		//Döküman collection a ekleniyor.
		
		collection.insertOne(document); 

} 
     
	
   
	
   
    
   } 
