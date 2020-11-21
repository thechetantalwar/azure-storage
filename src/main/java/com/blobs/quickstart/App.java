package com.blobs.quickstart;


import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

public class App
{
    public static void main( String[] args )
    {
        String file = "test.png";
        String connectStr = "###############";
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();
        BlobContainerClient blobContainerClient = blobServiceClient.getBlobContainerClient("blob-data");
        BlobClient blobClient = blobContainerClient.getBlobClient(file);
        blobClient.uploadFromFile("/Users/thechetantalwar/Desktop/screen.png");
        System.out.println("https://javalab.blob.core.windows.net/blob-data/"+file);
    }
}

