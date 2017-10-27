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
	public String app_version="0.1";
	private String AppName;
	private String StreamName;
	
	
	//private Date date;
	//private IApplicationInstance AppName;
	//private IMediaStream stream;
	
	

	public ToltekObject(IApplicationInstance appInstance)
	{
		setAppName(appInstance);
		
	}
	
	public ToltekObject(IMediaStream stream)
	{
		setStreamName(stream);
		
	}
	
		private void setAppName(IApplicationInstance appInstance) 
	
		{ AppName=appInstance.getApplication().getName(); }
	
		public String getAppName() 
	
		{  return AppName;  }

		private void setStreamName(IMediaStream stream) 
		
		{ StreamName=stream.getName(); }
	
	
		public String getStreamName() 
		
		{  return StreamName;  }

		
	

	
	
	

	

}
