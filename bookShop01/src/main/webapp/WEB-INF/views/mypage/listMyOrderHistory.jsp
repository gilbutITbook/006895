<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
	isELIgnored="false"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html >
<html>
<head>
<meta   charset="utf-8">
<script>
function search_order_history(fixedSearchPeriod){
	var formObj=document.createElement("form");
	var i_fixedSearch_period = document.createElement("input");
	i_fixedSearch_period.name="fixedSearchPeriod";
	i_fixedSearch_period.value=fixedSearchPeriod;
    formObj.appendChild(i_fixedSearch_period);
    document.body.appendChild(formObj); 
    formObj.method="get";
    formObj.action="${contextPath}/mypage/listMyOrderHistory.do";
    formObj.submit();
}

function fn_cancel_order(order_id){
	var answer=confirm("주문을 취소하시겠습니까?");
	if(answer==true){
		var formObj=document.createElement("form");
		var i_order_id = document.createElement("input"); 
	    
	    i_order_id.name="order_id";
	    i_order_id.value=order_id;
		
	    formObj.appendChild(i_order_id);
	    document.body.appendChild(formObj); 
	    formObj.method="post";
	    formObj.action="${contextPath}/mypage/cancelMyOrder.do";
	    formObj.submit();	
	}
}

</script>
</head>
<body>
	<H3>주문 배송 조회</H3>
	<form  method="post">	
		<table>
			<tbody>
				<tr>
					<td>
						<input type="radio" name="simple"  checked/> 간단조회 &nbsp;&nbsp;&nbsp;
						<input type="radio" name="simple" /> 일간  &nbsp;&nbsp;&nbsp;
						<input type="radio" name="simple" /> 월간
					</td>
				</tr>
				<tr>
					<td>
					  <select name="curYear">
					    <c:forEach   var="i" begin="0" end="5" >
					      <c:choose>
					        <c:when test="${endYear==endYear-i }">
					          <option value="${endYear}" selected>${endYear}</option>
					        </c:when>
					        <c:otherwise>
					          <option value="${endYear-i }">${endYear-i }</option>
					        </c:otherwise>
					      </c:choose>
					    </c:forEach>
					</select>년 <select name="curMonth" >
						 <c:forEach   var="i" begin="1" end="12">
					      <c:choose>
					        <c:when test="${endMonth==i }">
					          <option value="${i }"  selected>${i }</option>
					        </c:when>
					        <c:otherwise>
					          <option value="${i }">${i }</option>
					        </c:otherwise>
					      </c:choose>
					    </c:forEach>					
					</select>월
					
					 <select name="curDay">
					  <c:forEach   var="i" begin="1" end="31">
					      <c:choose>
					        <c:when test="${endDay==i }">
					          <option value="${i }"  selected>${i }</option>
					        </c:when>
					        <c:otherwise>
					          <option value="${i }">${i }</option>
					        </c:otherwise>
					      </c:choose>
					    </c:forEach>	
					</select>일  &nbsp;이전&nbsp;&nbsp;&nbsp;&nbsp; 
					<a href="javascript:search_order_history('today')">
					   <img   src="${contextPath}/resources/image/btn_search_one_day.jpg">
					</a>
					<a href="javascript:search_order_history('one_week')">
					   <img   src="${contextPath}/resources/image/btn_search_1_week.jpg">
					</a>
					<a href="javascript:search_order_history('two_week')">
					   <img   src="${contextPath}/resources/image/btn_search_2_week.jpg">
					</a>
					<a href="javascript:search_order_history('one_month')">
					   <img   src="${contextPath}/resources/image/btn_search_1_month.jpg">
					</a>
					<a href="javascript:search_order_history('two_month')">
					   <img   src="${contextPath}/resources/image/btn_search_2_month.jpg">
					</a>
					<a href="javascript:search_order_history('three_month')">
					   <img   src="${contextPath}/resources/image/btn_search_3_month.jpg">
					</a>
					<a href="javascript:search_order_history('four_month')">
					   <img   src="${contextPath}/resources/image/btn_search_4_month.jpg">
					</a>
					&nbsp;까지 조회
					</td>
				</tr>
				<tr>
				  <td>
				    <select name="search_condition">
						<option value="2015" checked>전체</option>
						<option value="2014">수령자</option>
						<option value="2013">주문자</option>
						<option value="2012">주문번호</option>
					</select>
					<input  type="text"  size="30" />  
					<input   type="button"  value="조회"/>
				  </td>
				</tr>
				<tr>
				  <td>
					조회한 기간:<input  type="text"  size="4" value="${beginYear}" />년
							<input  type="text"  size="4" value="${beginMonth}"/>월	
							 <input  type="text"  size="4" value="${beginDay}"/>일	
							 &nbsp; ~
							<input  type="text"  size="4" value="${endYear}" />년 
							<input  type="text"  size="4" value="${endMonth}"/>월	
							 <input  type="text"  size="4" value="${endDay}"/>일							 
				  </td>
				</tr>
			</tbody>
		</table>
		<div class="clear">
	</div>
</form>	
<div class="clear"></div>
<table class="list_view">
		<tbody align=center >
			<tr style="background:#33ff00" >
				<td class="fixed" >주문번호</td>
				<td class="fixed">주문일자</td>
				<td>주문내역</td>
				<td>주문금액/수량</td>
				<td>주문상태</td>
				<td>주문자</td>
				<td>수령자</td>
				<td>주문취소</td>
			</tr>
   <c:choose>
     <c:when test="${empty myOrderHistList }">			
			<tr>
		       <td colspan=8 class="fixed">
				  <strong>주문한 상품이 없습니다.</strong>
			   </td>
		     </tr>
	 </c:when>
	 <c:otherwise> 
     <c:forEach var="item" items="${myOrderHistList }" varStatus="i">
        <c:choose>
          <c:when test="${item.order_id != pre_order_id }">   
            <tr>       
				<td>
				  <a href="${contextPath}/mypage/myOrderDetail.do?order_id=${item.order_id }"><strong>${item.order_id }</strong>  </a>
				</td>
				<td >
				 <strong>${item.pay_order_time }</strong> 
				</td>
				<td> 
				    <strong>
					   <c:forEach var="item2" items="${myOrderHistList}" varStatus="j">
				          <c:if  test="${item.order_id ==item2.order_id}" >
				            <a href="${contextPath}/goods/goodsDetail.do?goods_id=${item2.goods_id }">${item2.goods_title }</a><br>
				         </c:if>   
					 </c:forEach>
					 </strong>
				</td>
				<td>
				   <strong>
				      <c:forEach var="item2" items="${myOrderHistList}" varStatus="j">
				          <c:if  test="${item.order_id ==item2.order_id}" >
				             ${item.goods_sales_price*item.order_goods_qty }원/${item.order_goods_qty }<br>
				         </c:if>   
					 </c:forEach>
				   </strong>
				</td>
				<td>
				  <strong>
				    <c:choose>
					    <c:when test="${item.delivery_state=='delivery_prepared' }">
					       배송준비중
					    </c:when>
					    <c:when test="${item.delivery_state=='delivering' }">
					       배송중
					    </c:when>
					    <c:when test="${item.delivery_state=='finished_delivering' }">
					       배송완료
					    </c:when>
					    <c:when test="${item.delivery_state=='cancel_order' }">
					       주문취소
					    </c:when>
					    <c:when test="${item.delivery_state=='returning_goods' }">
					       반품
					    </c:when>
				  </c:choose>
				  </strong>
				</td>
				<td>
				 <strong>${item.orderer_name }</strong> 
				</td>
				<td>
					<strong>${item.receiver_name }</strong>
				</td>
				<td>
			     <c:choose>
			   <c:when test="${item.delivery_state=='delivery_prepared'}">
			       <input  type="button" onClick="fn_cancel_order('${item.order_id}')" value="주문취소"  />
			   </c:when>
			   <c:otherwise>
			      <input  type="button" onClick="fn_cancel_order('${item.order_id}')" value="주문취소" disabled />
			   </c:otherwise>
			  </c:choose>
			    </td>
			</tr>
			<c:set  var="pre_order_id" value="${item.order_id }" />
		   </c:when>	
	  </c:choose>		
	</c:forEach>
	</c:otherwise>
  </c:choose>			   
		</tbody>
	</table>
     	
	<div class="clear"></div>
</body>
</html>