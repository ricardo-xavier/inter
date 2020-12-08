package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador362")
public class Somador362 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
