function validateEmail(email) {
    var re = /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$;
  }
  
  function validate() {
    var $result = $("#result");
    var email = $("#email").val();
    $result.text("");
  
    if (validateEmail(email)) {
      $result.text(email + " is valid :)");
      $result.css("color", "green");
    } else {
      $result.text(email + " is not valid :(");
      $result.css("color", "red");
    }
    return false;
  }
  
  $("#validate").bind("click", validate);