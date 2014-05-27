//
//  AdfitYoutube.m
//  AdfitYoutube
//
//  Created by Kittipong Kulapruk on 5/8/2557 BE.
//  Copyright (c) 2557 Kittipong Kulapruk. All rights reserved.
//

#import "AdfitYoutube.h"

@implementation AdfitYoutube

- (void) checkDaily:(CDVInvokedUrlCommand*)command{
	self.callbackId = command.callbackId;
    NSMutableDictionary* options = [command.arguments objectAtIndex:0];
    NSString * appId = [options objectForKey:@"appId"] ;
    NSString * appName = [options objectForKey:@"appName"] ;
    [[Harpy sharedInstance] setAppID:appId];
    [[Harpy sharedInstance] setAppName:appName];
    [[Harpy sharedInstance] setAlertType:HarpyAlertTypeForce];
}


@end
