import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLBuilder implements Builder {

	private Element document;
	private String filename;
	
	public XMLBuilder(String filename) 
	{
		this.filename = filename;
	}

	
	public Element getResult() {
		return document;
	}

	
	public void build() {
		try {
			 XmlMapper mapper = new XmlMapper();
			 HashMap<String, Object> map = mapper.readValue(new File(filename),HashMap.class);
				document = processMap(map);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Section section = new Section((String)map.get("title"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
			if (e != null) {
				try {
					section.add(e);
				} catch (Exception var5) {
					var5.printStackTrace();
				}
			}
		});
		return section;
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		Element para = new Paragraph((String) map.get("text"));
		return para;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		Element image = new Image((String) map.get("url"));
		return image;
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		Element imageProxy = new ImageProxy((String) map.get("url"));
		return imageProxy;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		Element table = new Table((String) map.get("url"));
		return table;
	}
	
	private Element processMap(HashMap<String, Object> map) 
	{
		String elementClass =  map.get("class").toString();
		Element readElement = null;

		if ("Section".equals(elementClass)) 
		{
			readElement = buildSection(map);
		} 
		else if ("Paragraph".equals(elementClass)) 
		{
			readElement = buildParagraph(map);
		} 
		else if ("Image".equals(elementClass)) 
		{
			readElement = buildImage(map);
		} 
		else if ("ImageProxy".equals(elementClass)) 
		{
			readElement = buildImageProxy(map);
		}
		return readElement;
	}
}
