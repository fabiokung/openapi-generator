package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.User;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class FakeApi {
    private ApiClient apiClient;

    public FakeApi() {
        this(new ApiClient());
    }

    public FakeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Test serialization of outer boolean types
    * <p><b>200</b> - Output boolean
    * @param booleanPostBody Input boolean as post body
    * @return Boolean
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Boolean fakeOuterBooleanSerialize(Boolean booleanPostBody) throws IOException {
        HttpResponse response = fakeOuterBooleanSerializeForHttpResponse(booleanPostBody);
        TypeReference typeRef = new TypeReference<Boolean>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Test serialization of outer boolean types
    * <p><b>200</b> - Output boolean
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Boolean
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Boolean fakeOuterBooleanSerialize(Boolean booleanPostBody, Map<String, Object> params) throws IOException {
        HttpResponse response = fakeOuterBooleanSerializeForHttpResponse(booleanPostBody, params);
        TypeReference typeRef = new TypeReference<Boolean>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fakeOuterBooleanSerializeForHttpResponse(Boolean booleanPostBody) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/boolean");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(booleanPostBody);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse fakeOuterBooleanSerializeForHttpResponse(java.io.InputStream booleanPostBody, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/boolean");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = booleanPostBody == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, booleanPostBody);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse fakeOuterBooleanSerializeForHttpResponse(Boolean booleanPostBody, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/boolean");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(booleanPostBody);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Test serialization of object with outer number type
    * <p><b>200</b> - Output composite
    * @param outerComposite Input composite as post body
    * @return OuterComposite
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OuterComposite fakeOuterCompositeSerialize(OuterComposite outerComposite) throws IOException {
        HttpResponse response = fakeOuterCompositeSerializeForHttpResponse(outerComposite);
        TypeReference typeRef = new TypeReference<OuterComposite>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Test serialization of object with outer number type
    * <p><b>200</b> - Output composite
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return OuterComposite
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OuterComposite fakeOuterCompositeSerialize(OuterComposite outerComposite, Map<String, Object> params) throws IOException {
        HttpResponse response = fakeOuterCompositeSerializeForHttpResponse(outerComposite, params);
        TypeReference typeRef = new TypeReference<OuterComposite>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fakeOuterCompositeSerializeForHttpResponse(OuterComposite outerComposite) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/composite");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(outerComposite);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse fakeOuterCompositeSerializeForHttpResponse(java.io.InputStream outerComposite, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/composite");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = outerComposite == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, outerComposite);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse fakeOuterCompositeSerializeForHttpResponse(OuterComposite outerComposite, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/composite");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(outerComposite);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Test serialization of outer number types
    * <p><b>200</b> - Output number
    * @param body Input number as post body
    * @return BigDecimal
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public BigDecimal fakeOuterNumberSerialize(BigDecimal body) throws IOException {
        HttpResponse response = fakeOuterNumberSerializeForHttpResponse(body);
        TypeReference typeRef = new TypeReference<BigDecimal>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Test serialization of outer number types
    * <p><b>200</b> - Output number
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return BigDecimal
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public BigDecimal fakeOuterNumberSerialize(BigDecimal body, Map<String, Object> params) throws IOException {
        HttpResponse response = fakeOuterNumberSerializeForHttpResponse(body, params);
        TypeReference typeRef = new TypeReference<BigDecimal>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fakeOuterNumberSerializeForHttpResponse(BigDecimal body) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/number");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(body);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse fakeOuterNumberSerializeForHttpResponse(java.io.InputStream body, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/number");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = body == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, body);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse fakeOuterNumberSerializeForHttpResponse(BigDecimal body, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/number");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(body);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Test serialization of outer string types
    * <p><b>200</b> - Output string
    * @param body Input string as post body
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public String fakeOuterStringSerialize(String body) throws IOException {
        HttpResponse response = fakeOuterStringSerializeForHttpResponse(body);
        TypeReference typeRef = new TypeReference<String>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Test serialization of outer string types
    * <p><b>200</b> - Output string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public String fakeOuterStringSerialize(String body, Map<String, Object> params) throws IOException {
        HttpResponse response = fakeOuterStringSerializeForHttpResponse(body, params);
        TypeReference typeRef = new TypeReference<String>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse fakeOuterStringSerializeForHttpResponse(String body) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/string");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(body);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse fakeOuterStringSerializeForHttpResponse(java.io.InputStream body, String mediaType) throws IOException {
          
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/string");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = body == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, body);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse fakeOuterStringSerializeForHttpResponse(String body, Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/outer/string");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(body);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * <p><b>200</b> - Success
    * @param query The query parameter
    * @param user The user parameter
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testBodyWithQueryParams(String query, User user) throws IOException {
        testBodyWithQueryParamsForHttpResponse(query, user);
    }

  /**
    * <p><b>200</b> - Success
    * @param query The query parameter
    * @param user The user parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testBodyWithQueryParams(String query, User user, Map<String, Object> params) throws IOException {
        testBodyWithQueryParamsForHttpResponse(query, user, params);
    }

    public HttpResponse testBodyWithQueryParamsForHttpResponse(String query, User user) throws IOException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling testBodyWithQueryParams");
        }// verify the required parameter 'user' is set
        if (user == null) {
            throw new IllegalArgumentException("Missing the required parameter 'user' when calling testBodyWithQueryParams");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/body-with-query-params");
        if (query != null) {
            String key = "query";
            Object value = query;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(user);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }

      public HttpResponse testBodyWithQueryParamsForHttpResponse(String query, java.io.InputStream user, String mediaType) throws IOException {
          // verify the required parameter 'query' is set
              if (query == null) {
              throw new IllegalArgumentException("Missing the required parameter 'query' when calling testBodyWithQueryParams");
              }// verify the required parameter 'user' is set
              if (user == null) {
              throw new IllegalArgumentException("Missing the required parameter 'user' when calling testBodyWithQueryParams");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/body-with-query-params");
              if (query != null) {
                  String key = "query";
                  Object value = query;
                  if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                  } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                  } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                  }
              }

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = user == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, user);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
      }

    public HttpResponse testBodyWithQueryParamsForHttpResponse(String query, User user, Map<String, Object> params) throws IOException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException("Missing the required parameter 'query' when calling testBodyWithQueryParams");
        }// verify the required parameter 'user' is set
        if (user == null) {
            throw new IllegalArgumentException("Missing the required parameter 'user' when calling testBodyWithQueryParams");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/body-with-query-params");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'query' to the map of query params
        allParams.put("query", query);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(user);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PUT, genericUrl, content).execute();
    }


  /**
    * To test \&quot;client\&quot; model
    * To test \&quot;client\&quot; model
    * <p><b>200</b> - successful operation
    * @param client client model
    * @return Client
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Client testClientModel(Client client) throws IOException {
        HttpResponse response = testClientModelForHttpResponse(client);
        TypeReference typeRef = new TypeReference<Client>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * To test \&quot;client\&quot; model
    * To test \&quot;client\&quot; model
    * <p><b>200</b> - successful operation
    * @param client client model
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Client
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Client testClientModel(Client client, Map<String, Object> params) throws IOException {
        HttpResponse response = testClientModelForHttpResponse(client, params);
        TypeReference typeRef = new TypeReference<Client>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse testClientModelForHttpResponse(Client client) throws IOException {
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new IllegalArgumentException("Missing the required parameter 'client' when calling testClientModel");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(client);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse testClientModelForHttpResponse(java.io.InputStream client, String mediaType) throws IOException {
          // verify the required parameter 'client' is set
              if (client == null) {
              throw new IllegalArgumentException("Missing the required parameter 'client' when calling testClientModel");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = client == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, client);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse testClientModelForHttpResponse(Client client, Map<String, Object> params) throws IOException {
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new IllegalArgumentException("Missing the required parameter 'client' when calling testClientModel");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(client);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


  /**
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * <p><b>400</b> - Invalid username supplied
    * <p><b>404</b> - User not found
    * @param number None
    * @param _double None
    * @param patternWithoutDelimiter None
    * @param _byte None
    * @param integer None
    * @param int32 None
    * @param int64 None
    * @param _float None
    * @param string None
    * @param binary None
    * @param date None
    * @param dateTime None
    * @param password None
    * @param paramCallback None
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, File binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws IOException {
        testEndpointParametersForHttpResponse(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
    }

  /**
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * <p><b>400</b> - Invalid username supplied
    * <p><b>404</b> - User not found
    * @param number None
    * @param _double None
    * @param patternWithoutDelimiter None
    * @param _byte None
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Map<String, Object> params) throws IOException {
        testEndpointParametersForHttpResponse(number, _double, patternWithoutDelimiter, _byte, params);
    }

    public HttpResponse testEndpointParametersForHttpResponse(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, File binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback) throws IOException {
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new IllegalArgumentException("Missing the required parameter 'number' when calling testEndpointParameters");
        }// verify the required parameter '_double' is set
        if (_double == null) {
            throw new IllegalArgumentException("Missing the required parameter '_double' when calling testEndpointParameters");
        }// verify the required parameter 'patternWithoutDelimiter' is set
        if (patternWithoutDelimiter == null) {
            throw new IllegalArgumentException("Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters");
        }// verify the required parameter '_byte' is set
        if (_byte == null) {
            throw new IllegalArgumentException("Missing the required parameter '_byte' when calling testEndpointParameters");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse testEndpointParametersForHttpResponse(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Map<String, Object> params) throws IOException {
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new IllegalArgumentException("Missing the required parameter 'number' when calling testEndpointParameters");
        }// verify the required parameter '_double' is set
        if (_double == null) {
            throw new IllegalArgumentException("Missing the required parameter '_double' when calling testEndpointParameters");
        }// verify the required parameter 'patternWithoutDelimiter' is set
        if (patternWithoutDelimiter == null) {
            throw new IllegalArgumentException("Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters");
        }// verify the required parameter '_byte' is set
        if (_byte == null) {
            throw new IllegalArgumentException("Missing the required parameter '_byte' when calling testEndpointParameters");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * To test enum parameters
    * To test enum parameters
    * <p><b>400</b> - Invalid request
    * <p><b>404</b> - Not found
    * @param enumHeaderStringArray Header parameter enum test (string array)
    * @param enumHeaderString Header parameter enum test (string)
    * @param enumQueryStringArray Query parameter enum test (string array)
    * @param enumQueryString Query parameter enum test (string)
    * @param enumQueryInteger Query parameter enum test (double)
    * @param enumQueryDouble Query parameter enum test (double)
    * @param enumFormStringArray Form parameter enum test (string array)
    * @param enumFormString Form parameter enum test (string)
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<String> enumFormStringArray, String enumFormString) throws IOException {
        testEnumParametersForHttpResponse(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
    }

  /**
    * To test enum parameters
    * To test enum parameters
    * <p><b>400</b> - Invalid request
    * <p><b>404</b> - Not found
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testEnumParameters(Map<String, Object> params) throws IOException {
        testEnumParametersForHttpResponse(params);
    }

    public HttpResponse testEnumParametersForHttpResponse(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<String> enumFormStringArray, String enumFormString) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake");
        if (enumQueryStringArray != null) {
            String key = "enum_query_string_array";
            Object value = enumQueryStringArray;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (enumQueryString != null) {
            String key = "enum_query_string";
            Object value = enumQueryString;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (enumQueryInteger != null) {
            String key = "enum_query_integer";
            Object value = enumQueryInteger;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (enumQueryDouble != null) {
            String key = "enum_query_double";
            Object value = enumQueryDouble;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse testEnumParametersForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * test inline additionalProperties
    * <p><b>200</b> - successful operation
    * @param requestBody request body
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testInlineAdditionalProperties(String requestBody) throws IOException {
        testInlineAdditionalPropertiesForHttpResponse(requestBody);
    }

  /**
    * test inline additionalProperties
    * <p><b>200</b> - successful operation
    * @param requestBody request body
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testInlineAdditionalProperties(String requestBody, Map<String, Object> params) throws IOException {
        testInlineAdditionalPropertiesForHttpResponse(requestBody, params);
    }

    public HttpResponse testInlineAdditionalPropertiesForHttpResponse(String requestBody) throws IOException {
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new IllegalArgumentException("Missing the required parameter 'requestBody' when calling testInlineAdditionalProperties");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/inline-additionalProperties");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(requestBody);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse testInlineAdditionalPropertiesForHttpResponse(java.io.InputStream requestBody, String mediaType) throws IOException {
          // verify the required parameter 'requestBody' is set
              if (requestBody == null) {
              throw new IllegalArgumentException("Missing the required parameter 'requestBody' when calling testInlineAdditionalProperties");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/inline-additionalProperties");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = requestBody == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, requestBody);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse testInlineAdditionalPropertiesForHttpResponse(String requestBody, Map<String, Object> params) throws IOException {
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new IllegalArgumentException("Missing the required parameter 'requestBody' when calling testInlineAdditionalProperties");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/inline-additionalProperties");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(requestBody);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * test json serialization of form data
    * <p><b>200</b> - successful operation
    * @param param field1
    * @param param2 field2
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testJsonFormData(String param, String param2) throws IOException {
        testJsonFormDataForHttpResponse(param, param2);
    }

  /**
    * test json serialization of form data
    * <p><b>200</b> - successful operation
    * @param param field1
    * @param param2 field2
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void testJsonFormData(String param, String param2, Map<String, Object> params) throws IOException {
        testJsonFormDataForHttpResponse(param, param2, params);
    }

    public HttpResponse testJsonFormDataForHttpResponse(String param, String param2) throws IOException {
        // verify the required parameter 'param' is set
        if (param == null) {
            throw new IllegalArgumentException("Missing the required parameter 'param' when calling testJsonFormData");
        }// verify the required parameter 'param2' is set
        if (param2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'param2' when calling testJsonFormData");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/jsonFormData");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse testJsonFormDataForHttpResponse(String param, String param2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'param' is set
        if (param == null) {
            throw new IllegalArgumentException("Missing the required parameter 'param' when calling testJsonFormData");
        }// verify the required parameter 'param2' is set
        if (param2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'param2' when calling testJsonFormData");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/fake/jsonFormData");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


}