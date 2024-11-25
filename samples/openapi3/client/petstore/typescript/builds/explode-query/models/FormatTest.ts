/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class FormatTest {
    'integer'?: number;
    'int32'?: number;
    'int64'?: number;
    'number': number;
    '_float'?: number;
    '_double'?: number;
    'decimal'?: string;
    'string'?: string;
    '_byte': string;
    'binary'?: HttpFile;
    'date': string;
    'dateTime'?: Date;
    'uuid'?: string;
    'password': string;
    /**
    * A string that is a 10 digit number. Can have leading zeros.
    */
    'patternWithDigits'?: string;
    /**
    * A string starting with \'image_\' (case insensitive) and one to three digits following i.e. Image_01.
    */
    'patternWithDigitsAndDelimiter'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "integer",
            "baseName": "integer",
            "type": "number",
            "format": ""
        },
        {
            "name": "int32",
            "baseName": "int32",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "int64",
            "baseName": "int64",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "number",
            "baseName": "number",
            "type": "number",
            "format": ""
        },
        {
            "name": "_float",
            "baseName": "float",
            "type": "number",
            "format": "float"
        },
        {
            "name": "_double",
            "baseName": "double",
            "type": "number",
            "format": "double"
        },
        {
            "name": "decimal",
            "baseName": "decimal",
            "type": "string",
            "format": "number"
        },
        {
            "name": "string",
            "baseName": "string",
            "type": "string",
            "format": ""
        },
        {
            "name": "_byte",
            "baseName": "byte",
            "type": "string",
            "format": "byte"
        },
        {
            "name": "binary",
            "baseName": "binary",
            "type": "HttpFile",
            "format": "binary"
        },
        {
            "name": "date",
            "baseName": "date",
            "type": "string",
            "format": "date"
        },
        {
            "name": "dateTime",
            "baseName": "dateTime",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "uuid",
            "baseName": "uuid",
            "type": "string",
            "format": "uuid"
        },
        {
            "name": "password",
            "baseName": "password",
            "type": "string",
            "format": "password"
        },
        {
            "name": "patternWithDigits",
            "baseName": "pattern_with_digits",
            "type": "string",
            "format": ""
        },
        {
            "name": "patternWithDigitsAndDelimiter",
            "baseName": "pattern_with_digits_and_delimiter",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FormatTest.attributeTypeMap;
    }

    public constructor() {
    }
}
