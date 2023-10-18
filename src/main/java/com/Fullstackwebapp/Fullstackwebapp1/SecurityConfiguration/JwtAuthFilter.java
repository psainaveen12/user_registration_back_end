//package com.Fullstackwebapp.Fullstackwebapp1.SecurityConfiguration;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//import static org.springframework.http.HttpHeaders.AUTHORIZATION;
//
//@Component
//public class JwtAuthFilter extends OncePerRequestFilter {
//    @Override
//    protected void doFilterInternal(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            FilterChain filterChain) throws ServletException, IOException {
//        final String authHeader = request.getHeader(AUTHORIZATION);
//        final String userEmail;
//        final String jwtToken;
//
//        if(authHeader == null || authHeader.startsWith("Bearer")){
//            filterChain.doFilter(request, response);
//            return;
//        }
//        jwtToken = authHeader.substring(7);
//        userEmail = "something"; // TODO to be implemented
////        if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
////            UserDetails userDetails = userDetailsService.LoadUserByUsername(userEmail);
////            final boolean isTokenValid; // TODO tobe implemented
////            if (isTokenValid) {
////                Username PasswordAuthenticationToken authToken =
////                        new Username PasswordAuthenticationToken (userDetails, credentials: null, userDetails.getAuthoritie authToken.setDetails (new WebAuthenticationDetailsSource().buildDetails (request));
////                SecurityContextHolder.getContext().setAuthentication (authToken);
////            }
////        }
//        filterChain.doFilter(request, response);
//
//    }
//}
