import * as appApi from "../api/appApi.js";

export const GuestHeaderPage = async function () {
  const responseAppTitle = await appApi.apptitle();
  const appimage = await appApi.appimage();
  let template = `
  			<!-- include_common_top.jsp start-->
			<h1>
				<a href="">방명록${responseAppTitle}</a>
			</h1>
			<!-- include_common_top.jsp end-->`;

  $("#header").html(template);
};
