package com.mrazi.ratemytrack.service

import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.regions.Regions
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import org.springframework.stereotype.Component
import com.amazonaws.auth.BasicAWSCredentials

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.client.builder.AwsClientBuilder
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.util.*


@Component
class S3Service {

    suspend fun putS3Object(file: MultipartFile, uuid: UUID) {

        val credentials: AWSCredentials = BasicAWSCredentials(
            "<AWS accesskey>",
            "<AWS secretkey>"
        )

        val s3client = AmazonS3ClientBuilder
            .standard()
            .withCredentials(AWSStaticCredentialsProvider(credentials))
            .withEndpointConfiguration(
                AwsClientBuilder.EndpointConfiguration(
                        "storage.yandexcloud.net","ru-central1"
            )
        )
            .build()

        val fileToUpload = File.createTempFile(uuid.toString(), "")
        file.transferTo(fileToUpload)

        s3client.putObject(
            "ratemytrack",
            uuid.toString(),
            fileToUpload
        );
    }

}