package com.fire.solrj;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

/**
 * 测试SolrJ
 * <p>Title: TestSolrJ</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月29日下午7:48:33
 * @version 1.0
 */
public class TestSolrJ {

	/**
	 * 添加文档
	 * <p>Title: testAddDocument</p>
	 * <p>Description: </p>
	 * @throws IOException 
	 * @throws SolrServerException 
	 */
	@Test
	public void testAddDocument() throws SolrServerException, IOException{
		//创建一个SolrServer对象.创建一个HttpSolrServer对象
		//需要制定solr服务的URL
		SolrServer solrServer = new HttpSolrServer("http://192.168.249.132:8180/solr/collection1");
		//创建一个文档对象,SolrInputDocument 
		SolrInputDocument document = new SolrInputDocument();
		//向文档中添加域,必须有id域,域的名称必须在schema.xml中定义
		document.addField("id", "test001");
		document.addField("item_title", "测试商品");
		document.addField("item_price", 1000);
		//把文档对象写入索引库
		solrServer.add(document);
		//提交
		solrServer.commit();
	}
	
	@Test
	public void deleteDocumentById() throws SolrServerException, IOException{
		SolrServer solrServer = new HttpSolrServer("http://192.168.249.132:8180/solr/collection1");
		solrServer.deleteById("test001");
		solrServer.commit();
	}
	
	@Test
	public void deleteDocumentByQuery() throws SolrServerException, IOException{
		SolrServer solrServer = new HttpSolrServer("http://192.168.249.132:8180/solr/collection1");
		solrServer.deleteByQuery("id:123");
		solrServer.commit();
		
	}
}
