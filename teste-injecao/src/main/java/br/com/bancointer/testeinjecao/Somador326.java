package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador326")
public class Somador326 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
