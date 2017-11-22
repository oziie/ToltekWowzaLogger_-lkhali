package com.toltek.wowza;

import com.wowza.wms.application.*;

import java.lang.reflect.InvocationTargetException;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.wowza.wms.amf.*;
import com.wowza.wms.client.*;
import com.wowza.wms.logging.WMSLogger;
import com.wowza.wms.mediacaster.IMediaCaster;
import com.wowza.wms.module.*;
import com.wowza.wms.request.*;
import com.wowza.wms.stream.IMediaStream;
import com.wowza.wms.module.ModuleFunction;

public class ToltekWowzaLogger extends ModuleBase {
	
	
	public void onAppStart(IApplicationInstance appInstance) throws InvocationTargetException 
	{
		//Wowza Streaming Engine Manager'a log aktaran bir methodtur.
		//Çıktısı Server-Logs kısmında debug loglarında görülebilir.
		
		getLogger().info(" Uygulama Basladi!!!");
		
		//ToltekObject nesnesi oluşturuluyor ve appInstance parametre veriliyor.
		ToltekObject Log=new ToltekObject(appInstance);
		
		
		//Exception kontrolü
		try
		{
			ToltekMongoLogger.LogaEkle(Log);
		}
		catch(InvocationTargetException ie)	
		{
			ie.getCause().toString();
		}
		
		
		getLogger().info("MongoDB aktarýldý!!!");
	
	}

	public void onAppStop(IApplicationInstance appInstance)  
	{
		
		
		getLogger().info(" Uygulama Bitti!!!");
		
		ToltekObject Log=new ToltekObject(appInstance);
		
		
		try 
		{
			ToltekMongoLogger.LogaEkle(Log);
					
		}
		catch(InvocationTargetException ie)
		{
			ie.getCause().toString();
		}
		
		
		getLogger().info("MongoDB aktarýldý!!!");
		
		
		
	}
	
	
	public void onStreamCreate(IMediaStream stream)  
	{
		getLogger().info("Stream Olustu");
		
		ToltekObject Log=new ToltekObject(stream);
		
		
		try 
		{
			ToltekMongoLogger.LogaEkle(Log);	
		}
		catch(InvocationTargetException ie)
		{
			ie.getCause().toString();
		}
		
		
		getLogger().info("MongoDB aktarýldý!!!");
		
	}
	
	
}
