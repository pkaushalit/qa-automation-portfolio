# JMeter Load Test

This project describes a basic load test created using Apache JMeter.

### 🔧 Test Scenario:
- 10 users (threads)
- 1-minute duration
- Target API: `https://jsonplaceholder.typicode.com/posts`

### 🔨 Steps to Create in JMeter:
1. Add a Thread Group with:
   - Number of Threads (users): 10
   - Ramp-Up Period: 1
   - Loop Count: 60 seconds (or set scheduler)
2. Add an HTTP Request sampler:
   - Method: GET
   - URL: https://jsonplaceholder.typicode.com/posts
3. Add Listener:
   - View Results Tree or Summary Report

This simulates 10 users accessing a REST API and is used to measure response time and server load handling.
