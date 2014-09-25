# Template functions
## Save Template
- Actors: Mail Transport Agent
- Entry Condition: A Transport Service plugin has been installed, and its
receiver has been configured.
- Flow of Events:
  1. The mail transport agent sends a template to the system.
  2. The system finds the account with a matching From: e-mail address.
  3. The system saves the template to the user's account.
  4. The system sends a response back to the MTA indicating the message was
  accepted.
- Exit Condition: The user can access and edit the template.
- Quality Requirements: The function must take steps to mitigate denial of
service attacks.

## Reject Unrecognized Sender
- Actors: Mail Transport Agent
- Entry Condition: The system did not find a matching user account during the
Save Template function, or the From: address on the e-mail was invalid.
- Flow of Events:
  1. The system sends a response to the mail transport agent indicating why the
  message was rejected.
  2. The system aborts processing the template.
- Exit Condition: The system does not save the template.

# User Management
## Manage Account
- Actors: Administrator
- Entry Condition: The administrator has logged in.
- Flow of Events:
  1. The administrator selects the Manage Account option.
  2. The system displays a list of accounts to the administrator.
  3. The administrator selects the account to manage.
  4. The system displays an interface to allow the administrator to change
  the settings on the account.
  5. The administrator makes changes to the account.
  6. The administrator selects the "Save" button.
  7. The system makes sure the form is complete. If so, it saves the changes
  to the account and notifies the administrator. If not, it notifies the
  administrator and returns to Step 4.
- Exit Condition: The account is updated.
- Quality Requirements: The interface to change accounts must be intuitive and
easy to use.

## Create Account
- Actors: Administrator, Mail Transport Agent
- Entry Condition: The administrator has logged in, a Transport Service plugin
has been installed, and a mail server has been added.
- Flow of Events:
  1. The administrator selects the Create Account option.
  2. The system prompts the administrator to enter a user name.
  3. The administrator enters a user name.
  4. The system ensures the user name is not used. If it is, it returns to
  Step 2. Otherwise, it displays the Manage User interface to the
  administrator.
  5. The administrator enters the account information.
  6. The administrator selects the "Save" button.
  7. The system sends an invitation e-mail to the user and notifies the
  administrator.
- Exit Condition: The user account is created.
- Quality Requirements: The interface to create accounts must be intuitive and
easy to use.

## Generate Invitation
- Actors: Administrator, Mail Transport Agent
- Entry Condition: The administrator has created an account.
- Flow of Events:
  1. The system creates an e-mail message containing the account information.
  2. The system connects to the mail transport agent.
  3. The system sends the message to the MTA.
  4. The MTA sends a response to the system.
  5. The system displays the status of the message delivery to the
  administrator.
- Exit Condition: The user account invitation is sent.
- Quality Requirements: The interface must display useful status messages to
the administrator.

## Add Email
- Actors: Administrator
- Entry Condition: The administrator is managing an account.
- Flow of Events:
  1. The administrator selects the Add Email button
  2. The system prompts the administrator to enter an e-mail address.
  3. The administrator enters an e-mail address.
  4. The system ensures the e-mail address is not used. If it is, it returns to
  Step 2. Otherwise, it adds the e-mail address to the account information
  the administrator is changing.
- Exit Condition: The e-mail is added to the account information, but the
account information is not saved at this point.
- Quality Requirements: The interface to add e-mails must be intuitive and
easy to use.

## Remove Email
- Actors: Administrator
- Entry Condition: The administrator is managing an account.
- Flow of Events:
  1. The administrator selects the Remove Email button
  2. The system lists the e-mail addresses associated with the account.
  3. The administrator selects e-mail addresses to remove.
  4. The system removes the e-mail addresses selected from the account
  information the administrator is changing.
- Exit Condition: The e-mails are removed from the account information, but the
account information is not saved at this point.
- Quality Requirements: The interface to remove e-mails must be intuitive and
easy to use.

#  Mail Transport Configuration
## Configure Mail Transport
- Actors: Administrator
- Entry Condition: The administrator is logged in.
- Flow of Events:
  1. The administrator selects the Mail Configuration button.
  2. The system shows the Mail Transport configuration options.
  3. The administrator selects a configuration option.
  4. The system shows the interface for that option.
  5. The administrator makes changes and saves the changes.
  6. The system performs the configuration steps and displays the results to
  the administrator.
- Exit Condition: The configuration is saved, or no changes are made and an
error message is displayed to the administrator describing why the
configuration was not saved.
- Quality Requirements: The interfaces must be intuitive and easy to use.

## Add Transport Service
- Actors: Administrator
- Entry Condition: The administrator has selected the Add Transport Plugin
option in the Mail Configuration settings.
- Flow of Events:
  1. The system prompts the user to search for a plugin.
  2. The administrator selects the plugin to upload and clicks the "Upload"
  button.
  3. The system receives the plugin from the administrator.
  4. The system verifies the integrity of the plugin. If verification fails, it
  displays an error to the administrator and goes to Step 1.
- Exit Condition: The plugin is added to the list of mail transports.
- Quality Requirements: Any error messages must be helpful to the
administrator.

## Remove Transport Service
- Actors: Administrator
- Entry Condition: The administrator has selected the Remove Transport Plugin
option in the Mail Configuration settings.
- Flow of Events:
  1. The system displays a list of transport plugins.
  2. The administrator selects the plugin to remove and clicks the "Remove"
  button.
  3. The system ensures at least one mail server has been configured with a
  different mail transport service. If not, it instructs the administrator to
  configure a different plugin and returns to the Mail Transport configuration
  screen.
  4. The system checks if the administrator's default server is using the
  plugin. If so, it prompts the administrator to choose a different default
  server before continuing.
  5. The system checks the default server of other users. If it is using the
  plugin, the system changes the default server to the administrator's default
  server.
  6. The system removes any mail servers that are using the plugin from the
  server options.
  7. The system determines which receivers are using the service being removed
  and instructs them to stop.
  8. The system waits for the receivers to stop and displays progress to the
  administrator.
  9. The system waits for any outgoing mail using the plugin to finish sending
  and displays progress to the administrator.
  10. The system clears the transport service's receiver configuration.
  11. The system unloads the transport plugin from memory and deletes the
  plugin.
- Exit Condition: The plugin is removed from the system.
- Quality Requirements: Any error messages must be helpful to the
administrator.

## Configure Mail Transport Receiver
- Actors: Administrator
- Entry Condition: The administrator has selected the Configure Mail Receiver
option in the Mail Configuration settings.
- Flow of Events:
  1. The system displays a list of transport plugins.
  2. The administrator selects the plugin to configure and clicks the
  "Configure" button.
  3. The system loads the plugin's configuration page and displays it to the
  administrator.
  4. The administrator configures the plugin.
  5. The administrator selects the Save button.
  6. If the receiver was already configured, the system waits for it to stop
  and displays progress to the administrator.
  7. The system saves the plugin configuration.
  10. The system loads the receiver into memory and starts the receiver.
- Exit Condition: The plugin's receiver is configured and ready to accept
templates.
- Quality Requirements: Any error messages must be helpful to the
administrator. Plugin loading and unloading should be relatively seemless and
not interfere with operations in progress.

## Add Mail Server
- Actors: Administrator
- Entry Condition: The administrator has selected the Add Mail Server option in
the Mail Configuration settings.
- Flow of Events:
  1. The system displays a list of transport plugins.
  2. The administrator selects the plugin to use and clicks the
  "Configure" button.
  3. The system loads the plugin's Add Server page and displays it to the
  administrator.
  4. The administrator enters the information required by the plugin.
  5. The administrator selects the Save button.
  6. The plugin verifies that the information is correct. If not, it displays
  an error message to the administrator and goes to Step 3.
  7. The system saves the server information and notifies the administrator.
- Exit Condition: Users can use the mail server to send messages.
- Quality Requirements: Any error messages must be helpful to the
administrator. Plugin loading and unloading should be relatively seemless and
not interfere with operations in progress.

## Remove Mail Server
- Actors: Administrator
- Entry Condition: The administrator has selected the Remove Mail Server option
in the Mail Configuration settings.
- Flow of Events:
  1. The system displays a list of configured servers.
  2. The administrator selects the plugin to use and clicks the
  "Remove" button.
  3. The system checks if the administrator's default server is being removed.
  If so, it prompts the administrator to choose a different default server
  before continuing.
  4. The system checks the default server of other users. If it is being
  removed, the system changes the default server to the administrator's default
  server.
  5. The system waits for any outgoing mail using the server to finish sending
  and displays progress to the administrator.
  6. The system removes the server information and notifies the administrator.
- Exit Condition: Users can no longer use the mail server to send messages.
- Quality Requirements: Any error messages must be helpful to the
administrator. Plugin loading and unloading should be relatively seemless and
not interfere with operations in progress.

# System Settings
## Log In
- Actors: User
- Entry Condition: The user has an account on the system.
- Flow of Events:
  1. The system prompts the user to log in.
  2. The user enters a user name and password.
  3. The user selects the Log In button.
  4. The system verifies the provided user name and password.
  5. The system generates an authentication token for the user and sends it to
  the user.
  6. The system redirects the user to the home page.
- Exit Condition: The user is logged in and can use the system.
- Quality Requirements: The system should protect credentials using standard
security processes. The system should prevent attackers from attempting to
guess credentials repeatedly.

## Change Password
- Actors: User
- Entry Condition: The user has logged in.
- Flow of Events:
  1. The user selects the Change Password button.
  2. The system prompts for the existing password and for the new password
  twice.
  3. The user enters the passwords.
  4. The system verifies that the existing password matches and that the two
  new passwords the user entered match. If not, it displays an appropriate
  error message and goes to Step 2.
  5. The system saves the new password and notifies the user.
  6. The system sends an e-mail reporting the password change to the user.
- Exit Condition: The user's password is changed.
- Quality Requirements: The system should protect credentials using standard
security processes.

## Set Default Mail Server
- Actors: User
- Entry Condition: The user has logged in; a mail server has been configured.
- Flow of Events:
  1. The user selects the Set Default Server button.
  2. The system shows the user a list of servers.
  3. The user chooses a server.
- Exit Condition: The user's default server is set.
- Quality Requirements: The interface should be simple and easy to use.
