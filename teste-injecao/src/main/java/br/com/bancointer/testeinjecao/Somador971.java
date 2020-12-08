package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador971")
public class Somador971 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
