const BACKEND_SERVER = "";

export const hostname=async ()=>{
   const response=await fetch(`${BACKEND_SERVER}/hostname`,{
      method:'GET'
   });
   const responseText= await response.text();
   return responseText;
}
export const hostip=async ()=>{
   const response=await fetch(`${BACKEND_SERVER}/hostip`,{
      method:'GET'
   });
   const responseText= await response.text();
   return responseText;
}
export const profile=async ()=>{
   const response=await fetch(`${BACKEND_SERVER}/profile`,{
      method:'GET'
   });
   const responseText= await response.text();
   return responseText;
}
export const apptitle=async ()=>{
   const response=await fetch(`${BACKEND_SERVER}/app-title`,{
      method:'GET'
   });
   const responseText= await response.text();
   return responseText;
}
export const appimage=async ()=>{
   const response=await fetch(`${BACKEND_SERVER}/image`,{
      method:'GET'
   });
   const responseText= await response.text();
   return responseText;
}
