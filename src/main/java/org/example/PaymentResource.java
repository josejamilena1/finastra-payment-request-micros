package org.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.example.beans.HalPaymentRequest;
import org.example.beans.HalPaymentTransferRequestCreation;
import org.example.beans.PaymentRequestResource;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/payment-requests")
public interface PaymentResource {
  /**
   * The third-party provider (PISP) send a payment request to the customer's bank in a standard structure (ISO:20022 pain.013.014) to complete the commercial transaction.
   */
  @POST
  @Produces({"application/json;charset=utf-8", "application/hal+json;charset=utf-8"})
  @Consumes("application/json")
  HalPaymentTransferRequestCreation paymentRequestsPost_1(
      @HeaderParam("Authorization") String authorization, PaymentRequestResource paymentRequest,
      @HeaderParam("Signature") String signature, @HeaderParam("X-Request-ID") String xRequestID,
      @HeaderParam("PSU-IP-Address") String pSUIPAddress,
      @HeaderParam("PSU-IP-Port") String pSUIPPort,
      @HeaderParam("PSU-HTTP-Method") String pSUHTTPMethod, @HeaderParam("PSU-Date") String pSUDate,
      @HeaderParam("PSU-GEO-Location") String pSUGEOLocation,
      @HeaderParam("PSU-User-Agent") String pSUUserAgent,
      @HeaderParam("PSU-Referer") String pSUReferer, @HeaderParam("PSU-Accept") String pSUAccept,
      @HeaderParam("PSU-Accept-Charset") String pSUAcceptCharset,
      @HeaderParam("PSU-Accept-Encoding") String pSUAcceptEncoding,
      @HeaderParam("PSU-Accept-Language") String pSUAcceptLanguage,
      @HeaderParam("Digest") String digest);

  /**
   * A third-party provider (PISP) request payment status from the bank (ASPSP - Account Servicing Payment Service Provider)
   */
  @Path("/{paymentRequestResourceId}")
  @GET
  @Produces({"application/json;charset=utf-8", "application/hal+json;charset=utf-8"})
  @Consumes("application/json")
  HalPaymentRequest paymentRequestsGet(@HeaderParam("Authorization") String authorization,
      @PathParam("paymentRequestResourceId") String paymentRequestResourceId,
      @HeaderParam("Signature") String signature, @HeaderParam("X-Request-ID") String xRequestID,
      @HeaderParam("PSU-IP-Address") String pSUIPAddress,
      @HeaderParam("PSU-IP-Port") String pSUIPPort,
      @HeaderParam("PSU-HTTP-Method") String pSUHTTPMethod, @HeaderParam("PSU-Date") String pSUDate,
      @HeaderParam("PSU-GEO-Location") String pSUGEOLocation,
      @HeaderParam("PSU-User-Agent") String pSUUserAgent,
      @HeaderParam("PSU-Referer") String pSUReferer, @HeaderParam("PSU-Accept") String pSUAccept,
      @HeaderParam("PSU-Accept-Charset") String pSUAcceptCharset,
      @HeaderParam("PSU-Accept-Encoding") String pSUAcceptEncoding,
      @HeaderParam("PSU-Accept-Language") String pSUAcceptLanguage,
      @HeaderParam("Digest") String digest);
}
