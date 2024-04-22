# Retrofit Implementation in Kotlin

This repository contains a basic implementation of Retrofit in Kotlin for making HTTP requests to a RESTful API.

## Introduction

Retrofit is a type-safe HTTP client for Android and Java developed by Square, Inc. It simplifies the process of sending network requests and handling responses. This README provides a brief overview of how to set up Retrofit in a Kotlin project and make simple GET and POST requests.

## Prerequisites

Before getting started, ensure that you have the following installed:

- Android Studio (latest version)
- Kotlin plugin for Android Studio
- Internet connectivity

## Setup

1. Add Retrofit and Gson Converter to your project's `build.gradle` file:

   ```groovy
   implementation 'com.squareup.retrofit2:retrofit:2.9.0'
   implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
