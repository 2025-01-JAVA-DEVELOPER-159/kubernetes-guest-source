import * as appApi from "../api/appApi.js";
export const GuestMainPage =async () => {
  const appimage = await appApi.appimage();
  const template = `
    <img src='image/${appimage}' width="540" height="350px" style="margin: 10px" />`;
  $("#content").html(template);
};
