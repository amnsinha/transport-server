package com.integratedServices.email;

public class EmailTemplate {

    private String url;

    public EmailTemplate(String url) {
        this.url = url;
    }

    public String getEmailTemplate(){
        String email = "<!doctype html>\n" +
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "  <head>\n" +
                "    <title>\n" +
                "    </title>\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <style type=\"text/css\">\n" +
                "      #outlook a{padding: 0;}\n" +
                "      \t\t\t.ReadMsgBody{width: 100%;}\n" +
                "      \t\t\t.ExternalClass{width: 100%;}\n" +
                "      \t\t\t.ExternalClass *{line-height: 100%;}\n" +
                "      \t\t\tbody{margin: 0; padding: 0; -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%;}\n" +
                "      \t\t\ttable, td{border-collapse: collapse; mso-table-lspace: 0pt; mso-table-rspace: 0pt;}\n" +
                "      \t\t\timg{border: 0; height: auto; line-height: 100%; outline: none; text-decoration: none; -ms-interpolation-mode: bicubic;}\n" +
                "      \t\t\tp{display: block; margin: 13px 0;}\n" +
                "    </style>\n" +
                "    <!--[if !mso]><!-->\n" +
                "    <style type=\"text/css\">\n" +
                "      @media only screen and (max-width:480px) {\n" +
                "      \t\t\t  \t\t@-ms-viewport {width: 320px;}\n" +
                "      \t\t\t  \t\t@viewport {\twidth: 320px; }\n" +
                "      \t\t\t\t}\n" +
                "    </style>\n" +
                "    <!--<![endif]-->\n" +
                "    <!--[if mso]> \n" +
                "\t\t<xml> \n" +
                "\t\t\t<o:OfficeDocumentSettings> \n" +
                "\t\t\t\t<o:AllowPNG/> \n" +
                "\t\t\t\t<o:PixelsPerInch>96</o:PixelsPerInch> \n" +
                "\t\t\t</o:OfficeDocumentSettings> \n" +
                "\t\t</xml>\n" +
                "\t\t<![endif]-->\n" +
                "    <!--[if lte mso 11]> \n" +
                "\t\t<style type=\"text/css\"> \n" +
                "\t\t\t.outlook-group-fix{width:100% !important;}\n" +
                "\t\t</style>\n" +
                "\t\t<![endif]-->\n" +
                "    <style type=\"text/css\">\n" +
                "      @media only screen and (max-width:480px) {\n" +
                "      \n" +
                "      \t\t\t  table.full-width-mobile { width: 100% !important; }\n" +
                "      \t\t\t\ttd.full-width-mobile { width: auto !important; }\n" +
                "      \n" +
                "      }\n" +
                "      @media only screen and (min-width:480px) {\n" +
                "      .dys-column-per-100 {\n" +
                "      \twidth: 100.000000% !important;\n" +
                "      \tmax-width: 100.000000%;\n" +
                "      }\n" +
                "      }\n" +
                "      @media only screen and (min-width:480px) {\n" +
                "      .dys-column-per-100 {\n" +
                "      \twidth: 100.000000% !important;\n" +
                "      \tmax-width: 100.000000%;\n" +
                "      }\n" +
                "      .dys-column-per-90 {\n" +
                "      \twidth: 90% !important;\n" +
                "      \tmax-width: 90%;\n" +
                "      }\n" +
                "      .dys-column-per-50 {\n" +
                "      \twidth: 50.000000% !important;\n" +
                "      \tmax-width: 50.000000%;\n" +
                "      }\n" +
                "      }\n" +
                "    </style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div>\n" +
                "      <!--[if mso | IE]>\n" +
                "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
                "<![endif]-->\n" +
                "      <div style='background:#4DBFBF;background-color:#4DBFBF;margin:0px auto;max-width:600px;'>\n" +
                "        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='background:#4DBFBF;background-color:#4DBFBF;width:100%;'>\n" +
                "          <tbody>\n" +
                "            <tr>\n" +
                "              <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
                "                <!--[if mso | IE]>\n" +
                "<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
                "<![endif]-->\n" +
                "                <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
                "                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
                "                    <tr>\n" +
                "                      <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
                "                        <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-collapse:collapse;border-spacing:0px;'>\n" +
                "                          <tbody>\n" +
                "                            <tr>\n" +
                "                              <td style='width:216px;'>\n" +
                "                                <img alt='Descriptive Alt Text' height='189' src='https://assets.opensourceemails.com/imgs/neopolitan/robot-happy.png' style='border:none;display:block;font-size:13px;height:189px;outline:none;text-decoration:none;width:100%;' width='216' />\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                      <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
                "                        <div style=\"color:#FFFFFF;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:36px;line-height:1;text-align:center;\">\n" +
                "                          Welcome!\n" +
                "                        </div>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                      <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
                "                        <div style=\"color:#187272;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:16px;line-height:20px;text-align:center;\">\n" +
                "                          To the awesomest place on Earth! We're sure you will feel right at home with Awesome Co.\n" +
                "                        </div>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                      <td align='center' style='font-size:0px;padding:10px 25px;word-break:break-word;' vertical-align='middle'>\n" +
                "                        <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-collapse:separate;line-height:100%;width:200px;'>\n" +
                "                          <tr>\n" +
                "                            <td align='center' bgcolor='#178F8F' role='presentation' style='background-color:#178F8F;border:none;border-radius:4px;cursor:auto;padding:10px 25px;' valign='middle'>\n" +
                "                              <a href="+this.url+" style=\"background:#178F8F;color:#ffffff;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:16px;font-weight:bold;line-height:30px;margin:0;text-decoration:none;text-transform:none;\" target='_blank'>\n" +
                "                                Activate account!\n" +
                "                              </a>\n" +
                "                            </td>\n" +
                "                          </tr>\n" +
                "                        </table>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </table>\n" +
                "                </div>\n" +
                "                <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </tbody>\n" +
                "        </table>\n" +
                "      </div>\n" +
                "      <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "      <!--[if mso | IE]>\n" +
                "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
                "<![endif]-->\n" +
                "      <div style='background:#F5774E;background-color:#F5774E;margin:0px auto;max-width:600px;'>\n" +
                "        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='background:#F5774E;background-color:#F5774E;width:100%;'>\n" +
                "          <tbody>\n" +
                "            <tr>\n" +
                "              <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
                "                <!--[if mso | IE]>\n" +
                "<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:300px;\">\n" +
                "<![endif]-->\n" +
                "                <div class='dys-column-per-50 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
                "                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
                "                    <tr>\n" +
                "                      <td align='left' style='font-size:0px;padding:25px 25px 0 50px;word-break:break-word;'>\n" +
                "                        <div style=\"color:#FFFFFF;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:13px;line-height:1;text-align:left;\">\n" +
                "                          Bob Erlicious\n" +
                "                        </div>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                      <td align='left' style='font-size:0px;padding:0 25px 0 50px;word-break:break-word;'>\n" +
                "                        <div style=\"color:#933f24;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:13px;line-height:1;text-align:left;\">\n" +
                "                          123 Flower Drive Victoria, BC V9P 2E8 1(250)222-2232\n" +
                "                        </div>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </table>\n" +
                "                </div>\n" +
                "                <!--[if mso | IE]>\n" +
                "</td><td style=\"vertical-align:top;width:300px;\">\n" +
                "<![endif]-->\n" +
                "                <div class='dys-column-per-50 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
                "                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
                "                    <tr>\n" +
                "                      <td align='right' style='font-size:0px;padding:25px 50px 0 25px;word-break:break-word;'>\n" +
                "                        <div style=\"color:#FFFFFF;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:13px;line-height:1;text-align:right;\">\n" +
                "                          Invoice: 00234\n" +
                "                        </div>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                      <td align='right' style='font-size:0px;padding:0 50px 0 25px;word-break:break-word;'>\n" +
                "                        <div style=\"color:#933f24;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:13px;line-height:1;text-align:right;\">\n" +
                "                          April 3, 2019\n" +
                "                        </div>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </table>\n" +
                "                </div>\n" +
                "                <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </tbody>\n" +
                "        </table>\n" +
                "      </div>\n" +
                "      <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "      <!--[if mso | IE]>\n" +
                "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
                "<![endif]-->\n" +
                "      <div style='background:#F5774E;background-color:#F5774E;margin:0px auto;max-width:600px;'>\n" +
                "        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='background:#F5774E;background-color:#F5774E;width:100%;'>\n" +
                "          <tbody>\n" +
                "            <tr>\n" +
                "              <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;'>\n" +
                "                <!--[if mso | IE]>\n" +
                "<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:600px;\">\n" +
                "<![endif]-->\n" +
                "                <div class='dys-column-per-100 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
                "                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
                "                    <tr>\n" +
                "                      <td align='left' style='font-size:0px;padding:10px 50px;word-break:break-word;'>\n" +
                "                        <table border='0' cellpadding='10' cellspacing='0' style='cellpadding:10;cellspacing:0;color:#000000;font-family:Helvetica, Arial, sans-serif;font-size:16px;line-height:22px;table-layout:auto;width:100%;' width='100%'>\n" +
                "                          <tbody>\n" +
                "                            <tr align='center'>\n" +
                "                              <th align='center' style='font-weight: normal; background-color: #ac4d2f; color: #ffffff;'>\n" +
                "                                Expected Delivery Date\n" +
                "                              </th>\n" +
                "                            </tr>\n" +
                "                            <tr>\n" +
                "                              <td style='background-color: #f7a084; color: #933f24; text-align: center;'>\n" +
                "                                Monday, 13th November 2019\n" +
                "                              </td>\n" +
                "                            </tr>\n" +
                "                          </tbody>\n" +
                "                        </table>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </table>\n" +
                "                </div>\n" +
                "                <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </tbody>\n" +
                "        </table>\n" +
                "      </div>\n" +
                "      <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "      <!--[if mso | IE]>\n" +
                "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:600px;\" width=\"600\"><tr><td style=\"line-height:0px;font-size:0px;mso-line-height-rule:exactly;\">\n" +
                "<![endif]-->\n" +
                "      <div style='background:#F5774E;background-color:#F5774E;margin:0px auto;max-width:600px;'>\n" +
                "        <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='background:#F5774E;background-color:#F5774E;width:100%;'>\n" +
                "          <tbody>\n" +
                "            <tr>\n" +
                "              <td style='direction:ltr;font-size:0px;padding:10px 0;text-align:center;vertical-align:top;'>\n" +
                "                <!--[if mso | IE]>\n" +
                "<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"vertical-align:top;width:540px;\">\n" +
                "<![endif]-->\n" +
                "                <div class='dys-column-per-90 outlook-group-fix' style='direction:ltr;display:inline-block;font-size:13px;text-align:left;vertical-align:top;width:100%;'>\n" +
                "                  <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>\n" +
                "                    <tr>\n" +
                "                      <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>\n" +
                "                        <div style=\"color:#933f24;font-family:'Droid Sans', 'Helvetica Neue', Arial, sans-serif;font-size:13px;line-height:1;text-align:left;\">\n" +
                "                          Thank you for your business. Please contact us with any questions.\n" +
                "                        </div>\n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </table>\n" +
                "                </div>\n" +
                "                <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </tbody>\n" +
                "        </table>\n" +
                "      </div>\n" +
                "      <!--[if mso | IE]>\n" +
                "</td></tr></table>\n" +
                "<![endif]-->\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>";
        return email;

    }
}
