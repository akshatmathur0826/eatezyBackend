package com.example.foodorderingapp.restaurantdetails;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.example.foodorderingapp.malldetails.Malldetails;

@Service
public class Servicerestaurantdetails {

	private final RepositoryRestaurantdetails repositoryRestaurantdetails;
	
	public Servicerestaurantdetails(RepositoryRestaurantdetails repositoryRestaurantdetails)
	{
		this.repositoryRestaurantdetails = repositoryRestaurantdetails;
	}
	
	public List<Restaurantdetails> getRestaurantsByMall(Malldetails mall) {
        return repositoryRestaurantdetails.findBymalldetails(mall);
    }
	
	public List<byte[]> getrestaurantImage(Malldetails mall) throws IOException
	{
		List<byte[]> imageData = new ArrayList<byte[]>();
		System.out.println(mall.getMallid());
		List<String> imageMetaData =  repositoryRestaurantdetails.getimage(mall.getMallid());
		System.out.println("imagemetadata is: "+imageMetaData);
		for(int i=0;i<imageMetaData.size();i++)
		{
			System.out.println("imageMetaData inside for loop: "+imageMetaData.get(i));
			URL resourceUrl = getClass().getResource("/images/" + imageMetaData.get(i));
			System.out.println("Resource URL: " + resourceUrl);
			//File file = new File("/foodorderingapp/images/"+imageMetaData.get(i));
			//BufferedImage originalImage=ImageIO.read(getClass().getResource("/images/"+imageMetaData.get(i)));
			BufferedImage originalImage=ImageIO.read(resourceUrl);
			System.out.println(originalImage);
			//BufferedImage originalImage=ImageIO.read(file);
	        ByteArrayOutputStream baos=new ByteArrayOutputStream();
	        ImageIO.write(originalImage, "jpg", baos );
	        byte[] imageInByte=baos.toByteArray();
	        System.out.println("before adding");
			imageData.add(imageInByte);
			System.out.println("after adding");
		}
	    
	        return imageData;
		
	}
}
