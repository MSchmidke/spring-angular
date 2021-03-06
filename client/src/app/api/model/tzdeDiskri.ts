/**
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { CodePunkt } from './codePunkt';
import { ZugIdentifikation } from './zugIdentifikation';

/**
 * RWEI was ist eine TzdeDiskri
 */
export interface TzdeDiskri { 
    /**
     * RWEI ginge das nicht als enum?
     */
    type: string;
    /**
     * RWEI was ist das? Ich finde kein sample.
     */
    lenkziffer?: string;
    /**
     * RWEI was ist das? Ich finde kein sample.
     */
    verzoegerungszeit?: string;
    refZugIdentifikation: ZugIdentifikation;
    ref2ZugIdentifikation?: ZugIdentifikation;
    refCodepunkt?: CodePunkt;
    /**
     * RWEI ginge das nicht als enum?
     */
    richtung?: string;
    /**
     * RWEI ginge das nicht als enum?
     */
    fortschaltart?: string;
    /**
     * RWEI was ist das und in welche Zeitzone?
     */
    time?: string;
}