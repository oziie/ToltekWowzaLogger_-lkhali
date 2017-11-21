package com.toltek.wowza;

import com.wowza.wms.amf.*;
import com.wowza.wms.application.*;
import com.wowza.wms.client.*;
import com.wowza.wms.module.*;
import com.wowza.wms.request.*;
import com.wowza.wms.stream.*;

import sun.util.calendar.BaseCalendar.Date;

public class ToltekObject 
{
	//Alan değişkenleri tanımlanıyor.
	
	public String app_version="0.1";
	private String AppName;
	private String StreamName;
	
	
	// İstenirse kullanılabilinecek diğer değişkenler.
	//Buna göre ToltekWowzaLogger içerisinde gerekli methodlar da düzenlenmeli.
	
	//private Date date;
	//private IApplicationInstance AppName;
	//private IMediaStream stream;
	
	
        //Yapıcı methodlar ToltekWowzaLogger daki methodlardan gelen nesne türlerine göre
	//parametrelere ayrılmış olarak oluşturuluyor.
	
	//IApplicationInstance nesnesi alır.
	public ToltekObject(IApplicationInstance appInstance)
	{ setAppName(appInstance); } 
	
	//IMediaStream nesnesi alır.
	public ToltekObject(IMediaStream stream)
	{ setStreamName(stream); }
	
		//AppName için getApplication().getName() Wowza'nın isim getirmek için
		//yazdığı metodlardır.
		private void setAppName(IApplicationInstance appInstance) 
			
		{ AppName=appInstance.getApplication().getName(); }
	
		public String getAppName() 
	
		{  return AppName;  }

		//getName() Wowza tarafından yazılmış bir metodtur.
		private void setStreamName(IMediaStream stream) 
		
		{ StreamName=stream.getName(); }
	
		public String getStreamName() 
		
		{  return StreamName;  }
	
}
