const BACKEND_SERVER = "";

export const listGuest=async ()=>{
   const response=await fetch(`${BACKEND_SERVER}/guests`,{
      method:'GET'
   });
   const responseJsonObject= await response.json();
   return responseJsonObject;
}
export const viewGuest=async (guest_no)=>{
   const response=await fetch(`${BACKEND_SERVER}/guests/${guest_no}`,{
      method:'GET'
   });
   const responseJsonObject= await response.json();
   return responseJsonObject;
}
export const writeGuest_Fetch=async (sendJsonObject)=>{
   const response=await fetch(`${BACKEND_SERVER}/guests`,{
      method:'POST',
      headers:{
         'Content-Type':'application/json'
      },
      body:JSON.stringify(sendJsonObject)
   });
   const responseJsonObject=await response.json();
   return responseJsonObject;
}
export const writeGuest=async (sendJsonObject)=>{
   let returnResponseJsonObject=null;
   await $.ajax(
            {
               url:`${BACKEND_SERVER}/guests`,
               method:"POST",
               data:JSON.stringify(sendJsonObject),
               dataType:'json',
               contentType:'application/json;charset=UTF-8',
               success:function(responseJsonObject){
                  returnResponseJsonObject=responseJsonObject;
           }
      }

   );
   console.log('>>>>>>>>>>>>>>>>>>>>test:',returnResponseJsonObject);
   return returnResponseJsonObject;
}
export const modifyGuest=async (sendJsonObject)=>{
   const response=await fetch(`${BACKEND_SERVER}/guests/${sendJsonObject.guestNo}`,{
      method:'PUT',
      headers:{
         'Content-Type':'application/json'
      },
      body:JSON.stringify(sendJsonObject)
   });
   const responseJsonObject=await response.json();
   return responseJsonObject;
}


export const removeGuest=async (guest_no)=>{
   console.log(">>>>>>"+guest_no);
   const response=await fetch(`${BACKEND_SERVER}/guests/${guest_no}`,{
      method:'DELETE'
   });
   const responseJsonObject = await response.json();
   return responseJsonObject;
}