/*******************************************************************************
 * Copyright 2012 The Infinit.e Open Source Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.ikanow.infinit.e.data_model.custom;

import org.apache.hadoop.conf.Configuration;

import com.mongodb.hadoop.MongoConfig;

public class InfiniteMongoConfig extends MongoConfig
{	
	public InfiniteMongoConfig(Configuration conf)
	{
		super(conf);		
	}
	
	public int getMaxSplits()
	{
		return InfiniteMongoConfigUtil.getMaxSplits( _conf );
	}

	public void setMaxSplits( int max_splits ){
	    InfiniteMongoConfigUtil.setMaxSplits( _conf, max_splits );
	}
	
	public int getMaxDocsPerSplit(){
	    return InfiniteMongoConfigUtil.getMaxDocsPerSplit( _conf );
	}
	
	public void setMaxDocsPerSplit( int max_docs_per_split ){
	    InfiniteMongoConfigUtil.setMaxDocsPerSplit( _conf, max_docs_per_split );
	}
}
